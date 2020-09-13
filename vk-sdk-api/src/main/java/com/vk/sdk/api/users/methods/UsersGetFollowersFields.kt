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
package com.vk.sdk.api.users.methods

import com.vk.api.sdk.requests.VKRequest
import com.vk.sdk.api.GsonHolder
import com.vk.sdk.api.users.dto.UsersFields
import com.vk.sdk.api.users.dto.UsersGetFollowersFieldsResponseDto
import com.vk.sdk.api.users.dto.UsersGetFollowersNameCase
import com.vk.sdk.api.users.responses.UsersGetFollowersFieldsResponse
import kotlin.Int
import kotlin.collections.List
import org.json.JSONObject

/**
 * Returns a list of IDs of followers of the user in question, sorted by date added, most recent
 * first.
 * @param userId User ID. minimum 0
 * @param offset Offset needed to return a specific subset of followers. minimum 0
 * @param count Number of followers to return. default 100 minimum 0 maximum 1000
 * @param fields Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate'
 * (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile',
 * 'rate', 'contacts', 'education', 'online'. 
 * @param nameCase Case for declension of user name and surname: 'nom' � nominative (default), 'gen'
 * � genitive , 'dat' � dative, 'acc' � accusative , 'ins' � instrumental , 'abl' � prepositional 
 */
class UsersGetFollowersFields(
    private val userId: Int? = null,
    private val offset: Int? = null,
    private val count: Int? = null,
    private val fields: List<UsersFields>? = null,
    private val nameCase: UsersGetFollowersNameCase? = null
) : VKRequest<UsersGetFollowersFieldsResponseDto>("users.getFollowers") {
    init {
        userId?.let { value ->
            addParam("user_id", value)
        }
        offset?.let { value ->
            addParam("offset", value)
        }
        count?.let { value ->
            addParam("count", value)
        }
        fields?.let { value ->
            addParam("fields", value.map { it.value })
        }
        nameCase?.let { value ->
            addParam("name_case", value.value)
        }
    }

    override fun parse(r: JSONObject): UsersGetFollowersFieldsResponseDto =
            GsonHolder.gson.fromJson(r.toString(),
            UsersGetFollowersFieldsResponse::class.java).response
}
