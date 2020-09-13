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
package com.vk.sdk.api.market.methods

import com.vk.api.sdk.requests.VKRequest
import com.vk.sdk.api.GsonHolder
import com.vk.sdk.api.market.dto.MarketGetExtendedResponseDto
import com.vk.sdk.api.market.responses.MarketGetExtendedResponse
import kotlin.Boolean
import kotlin.Int
import org.json.JSONObject

/**
 * Returns items list for a community.
 * @param ownerId ID of an item owner community, "Note that community id in the 'owner_id' parameter
 * should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community "
 * 
 * @param albumId  default 0 minimum 0
 * @param count Number of items to return. default 100 minimum 0 maximum 200
 * @param offset Offset needed to return a specific subset of results. minimum 0
 * @param extended '1' � method will return additional fields: 'likes, can_comment, car_repost,
 * photos'. These parameters are not returned by default. 
 */
class MarketGetExtended(
    private val ownerId: Int,
    private val albumId: Int? = null,
    private val count: Int? = null,
    private val offset: Int? = null,
    private val extended: Boolean? = null
) : VKRequest<MarketGetExtendedResponseDto>("market.get") {
    init {
        addParam("owner_id", ownerId)
        albumId?.let { value ->
            addParam("album_id", value)
        }
        count?.let { value ->
            addParam("count", value)
        }
        offset?.let { value ->
            addParam("offset", value)
        }
        extended?.let { value ->
            addParam("extended", if (value) 1 else 0)
        }
    }

    override fun parse(r: JSONObject): MarketGetExtendedResponseDto =
            GsonHolder.gson.fromJson(r.toString(), MarketGetExtendedResponse::class.java).response
}
