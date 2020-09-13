/**
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
*/
// *********************************************************************
// THIS FILE IS AUTO GENERATED!
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING.
// *********************************************************************
package com.vk.sdk.api.photos.methods

import com.vk.api.sdk.requests.VKRequest
import com.vk.sdk.api.GsonHolder
import com.vk.sdk.api.photos.responses.PhotosPutTagResponse
import kotlin.Float
import kotlin.Int
import org.json.JSONObject

/**
 * Adds a tag on the photo.
 * @param photoId Photo ID. minimum 0
 * @param userId ID of the user to be tagged. 
 * @param ownerId ID of the user or community that owns the photo. minimum 0
 * @param x Upper left-corner coordinate of the tagged area (as a percentage of the photo's width). 
 * @param y Upper left-corner coordinate of the tagged area (as a percentage of the photo's height).
 * 
 * @param x2 Lower right-corner coordinate of the tagged area (as a percentage of the photo's
 * width). 
 * @param y2 Lower right-corner coordinate of the tagged area (as a percentage of the photo's
 * height). 
 */
class PhotosPutTag(
    private val photoId: Int,
    private val userId: Int,
    private val ownerId: Int? = null,
    private val x: Float? = null,
    private val y: Float? = null,
    private val x2: Float? = null,
    private val y2: Float? = null
) : VKRequest<Int>("photos.putTag") {
    init {
        addParam("photo_id", photoId)
        addParam("user_id", userId)
        ownerId?.let { value ->
            addParam("owner_id", value)
        }
        x?.let { value ->
            addParam("x", value.toString())
        }
        y?.let { value ->
            addParam("y", value.toString())
        }
        x2?.let { value ->
            addParam("x2", value.toString())
        }
        y2?.let { value ->
            addParam("y2", value.toString())
        }
    }

    override fun parse(r: JSONObject): Int = GsonHolder.gson.fromJson(r.toString(),
            PhotosPutTagResponse::class.java).response
}
