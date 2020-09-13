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
package com.vk.sdk.api.video.methods

import com.vk.api.sdk.requests.VKRequest
import com.vk.sdk.api.GsonHolder
import com.vk.sdk.api.video.dto.VideoGetAlbumsByVideoExtendedResponseDto
import com.vk.sdk.api.video.responses.VideoGetAlbumsByVideoExtendedResponse
import kotlin.Boolean
import kotlin.Int
import org.json.JSONObject

/**
 * @param ownerId  
 * @param videoId  minimum 0
 * @param targetId  
 * @param extended  default 0
 */
class VideoGetAlbumsByVideoExtended(
    private val ownerId: Int,
    private val videoId: Int,
    private val targetId: Int? = null,
    private val extended: Boolean? = null
) : VKRequest<VideoGetAlbumsByVideoExtendedResponseDto>("video.getAlbumsByVideo") {
    init {
        addParam("owner_id", ownerId)
        addParam("video_id", videoId)
        targetId?.let { value ->
            addParam("target_id", value)
        }
        extended?.let { value ->
            addParam("extended", if (value) 1 else 0)
        }
    }

    override fun parse(r: JSONObject): VideoGetAlbumsByVideoExtendedResponseDto =
            GsonHolder.gson.fromJson(r.toString(),
            VideoGetAlbumsByVideoExtendedResponse::class.java).response
}
