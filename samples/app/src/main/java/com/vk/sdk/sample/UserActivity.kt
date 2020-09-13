/*******************************************************************************
 * The MIT License (MIT)
 *
 * Copyright (c) 2019 vk.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/

package com.vk.sdk.sample

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.vk.api.sdk.VK
import com.vk.api.sdk.VKApiCallback
import com.vk.sdk.api.friends.dto.FriendsGetFieldsResponseDto
import com.vk.sdk.api.friends.methods.FriendsGetFields
import com.vk.sdk.api.users.dto.UsersFields
import com.vk.sdk.sample.models.VKUser
import com.vk.sdk.sample.requests.VKUsersCommand
import com.vk.sdk.sample.requests.VKWallPostCommand

class UserActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val logoutBtn = findViewById<Button>(R.id.logoutBtn)
        logoutBtn.setOnClickListener {
            VK.logout()
            WelcomeActivity.startFrom(this)
            finish()
        }
        val shareBtn = findViewById<Button>(R.id.shareBtn)
        shareBtn.setOnClickListener {
            requestPhoto()
        }

        requestUsers()

        requestFriends()
    }

    private fun requestUsers() {
        VK.execute(VKUsersCommand(), object: VKApiCallback<List<VKUser>> {
            override fun success(result: List<VKUser>) {
                if (!isFinishing && !result.isEmpty()) {
                    val nameTV = findViewById<TextView>(R.id.nameTV)
                    val user = result[0]
                    nameTV.text = "${user.firstName} ${user.lastName}"
                    nameTV.setOnClickListener(createOnClickListener(user.id))

                    val avatarIV = findViewById<ImageView>(R.id.avatarIV)
                    if (!TextUtils.isEmpty(user.photo)) {
                        Picasso.get()
                                .load(user.photo)
                                .error(R.drawable.user_placeholder)
                                .into(avatarIV)
                    } else {
                        avatarIV.setImageResource(R.drawable.user_placeholder)
                    }
                    avatarIV.setOnClickListener(createOnClickListener(user.id))
                }
            }
            override fun fail(error: Exception) {
                Log.e(TAG, error.toString())
            }
        })
    }

    private fun requestFriends() {
        val fields = listOf(UsersFields.PHOTO_200)
        VK.execute(FriendsGetFields(fields = fields), object: VKApiCallback<FriendsGetFieldsResponseDto> {
            override fun success(result: FriendsGetFieldsResponseDto) {
                val friends = result.items
                if (!isFinishing && friends.isNotEmpty()) {
                    val vkUsers = friends.map { friend ->
                        VKUser(
                            id = friend.id ?: 0,
                            firstName = friend.firstName ?: "",
                            lastName = friend.lastName ?: "",
                            photo = friend.photo200 ?: "",
                            deactivated = friend.deactivated != null
                        )
                    }
                    showFriends(vkUsers)
                }
            }
            override fun fail(error: Exception) {
                Log.e(TAG, error.toString())
            }
        })
    }

    private fun showFriends(friends: List<VKUser>) {
        val recyclerView = findViewById<RecyclerView>(R.id.friendsRV)
        recyclerView.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)

        val adapter = FriendsAdapter()
        adapter.setData(friends)

        recyclerView.adapter = adapter
    }

    private fun requestPhoto() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_REQ_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == IMAGE_REQ_CODE) {
            if (resultCode == RESULT_OK && data != null && data.data != null) {
                sharePost(Uri.parse(PathUtils.getPath(this, data.data!!)))
            } else {
                sharePost()
            }
        }
    }

    private fun sharePost(uri: Uri? = null) {
        val messageField = findViewById<EditText>(R.id.messageET)

        val photos = ArrayList<Uri>()
        uri?.let {
            photos.add(it)
        }
        VK.execute(VKWallPostCommand(messageField.text.toString(), photos), object: VKApiCallback<Int> {
            override fun success(result: Int) {
                // TODO Use ToastUtils
                Toast.makeText(this@UserActivity, R.string.wall_ok, Toast.LENGTH_SHORT).show()
            }

            override fun fail(error: Exception) {
                Log.e(TAG, error.toString())
            }
        })
    }

    private fun createOnClickListener(userId: Int) = View.OnClickListener {
        VK.urlResolver.open(it.context, "https://vk.com/id$userId")
    }

    inner class FriendsAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {
        private val friends: MutableList<VKUser> = arrayListOf()

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
                = UserHolder(parent.context)

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            (holder as UserHolder).bind(friends[position])
        }

        fun setData(friends: List<VKUser>) {
            this.friends.clear()
            this.friends.addAll(friends)
            notifyDataSetChanged()
        }

        override fun getItemCount() = friends.size
    }

    inner class UserHolder(context: Context?): RecyclerView.ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_user, null)) {
        private val avatarIV: ImageView = itemView.findViewById(R.id.avatarIV)
        private val nameTV: TextView = itemView.findViewById(R.id.nameTV)

        fun bind(user: VKUser) {
            nameTV.text = "${user.firstName} ${user.lastName}"
            nameTV.setOnClickListener(createOnClickListener(user.id))
            if (!TextUtils.isEmpty(user.photo)) {
                Picasso.get().load(user.photo).error(R.drawable.user_placeholder).into(avatarIV)
            } else {
                avatarIV.setImageResource(R.drawable.user_placeholder)
            }
            avatarIV.setOnClickListener(createOnClickListener(user.id))
        }
    }

    companion object {
        private const val TAG = "UserActivity"

        private const val IMAGE_REQ_CODE = 101

        fun startFrom(context: Context) {
            val intent = Intent(context, UserActivity::class.java)
            context.startActivity(intent)
        }
    }
}