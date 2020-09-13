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
package com.vk.sdk.api.storage.methods

import com.vk.api.sdk.requests.VKRequest
import com.vk.sdk.api.GsonHolder
import com.vk.sdk.api.storage.responses.StorageGetKeysResponse
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import org.json.JSONObject

/**
 * Returns the names of all variables.
 * @param userId user id, whose variables names are returned if they were requested with a server
 * method. minimum 0
 * @param offset  default 0 minimum 0
 * @param count amount of variable names the info needs to be collected from. default 100 minimum 0
 * maximum 1000
 */
class StorageGetKeys(
    private val userId: Int? = null,
    private val offset: Int? = null,
    private val count: Int? = null
) : VKRequest<List<String>>("storage.getKeys") {
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
    }

    override fun parse(r: JSONObject): List<String> = GsonHolder.gson.fromJson(r.toString(),
            StorageGetKeysResponse::class.java).response
}
