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
import com.vk.sdk.api.base.dto.BaseImage
import com.vk.sdk.api.photos.responses.PhotosSaveOwnerCoverPhotoResponse
import kotlin.String
import kotlin.collections.List
import org.json.JSONObject

/**
 * Saves cover photo after successful uploading.
 * @param hash Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server]. 
 * @param photo Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server]. 
 */
class PhotosSaveOwnerCoverPhoto(
    private val hash: String,
    private val photo: String
) : VKRequest<List<BaseImage>>("photos.saveOwnerCoverPhoto") {
    init {
        addParam("hash", hash)
        addParam("photo", photo)
    }

    override fun parse(r: JSONObject): List<BaseImage> = GsonHolder.gson.fromJson(r.toString(),
            PhotosSaveOwnerCoverPhotoResponse::class.java).response
}
