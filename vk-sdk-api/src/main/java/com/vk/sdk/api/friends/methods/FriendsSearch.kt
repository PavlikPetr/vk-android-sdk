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
package com.vk.sdk.api.friends.methods

import com.vk.api.sdk.requests.VKRequest
import com.vk.sdk.api.GsonHolder
import com.vk.sdk.api.friends.dto.FriendsSearchNameCase
import com.vk.sdk.api.friends.dto.FriendsSearchResponseDto
import com.vk.sdk.api.friends.responses.FriendsSearchResponse
import com.vk.sdk.api.users.dto.UsersFields
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import org.json.JSONObject

/**
 * Returns a list of friends matching the search criteria.
 * @param userId User ID. minimum 0
 * @param q Search query string (e.g., 'Vasya Babich'). 
 * @param fields Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate'
 * (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile',
 * 'rate', 'contacts', 'education', 'online', 
 * @param nameCase Case for declension of user name and surname: 'nom' � nominative (default), 'gen'
 * � genitive , 'dat' � dative, 'acc' � accusative , 'ins' � instrumental , 'abl' � prepositional
 * default "Nom"
 * @param offset Offset needed to return a specific subset of friends. minimum 0
 * @param count Number of friends to return. default 20 minimum 0 maximum 1000
 */
class FriendsSearch(
    private val userId: Int,
    private val q: String? = null,
    private val fields: List<UsersFields>? = null,
    private val nameCase: FriendsSearchNameCase? = null,
    private val offset: Int? = null,
    private val count: Int? = null
) : VKRequest<FriendsSearchResponseDto>("friends.search") {
    init {
        addParam("user_id", userId)
        q?.let { value ->
            addParam("q", value)
        }
        fields?.let { value ->
            addParam("fields", value)
        }
        nameCase?.let { value ->
            addParam("name_case", value.value)
        }
        offset?.let { value ->
            addParam("offset", value)
        }
        count?.let { value ->
            addParam("count", value)
        }
    }

    override fun parse(r: JSONObject): FriendsSearchResponseDto =
            GsonHolder.gson.fromJson(r.toString(), FriendsSearchResponse::class.java).response
}
