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
package com.vk.sdk.api.photos.dto

import com.google.gson.annotations.SerializedName
import com.vk.sdk.api.base.dto.BaseBoolInt
import com.vk.sdk.api.base.dto.BaseLikes
import com.vk.sdk.api.base.dto.BaseObjectCount
import com.vk.sdk.api.base.dto.BasePropertyExists
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * @param albumId Album ID
 * @param date Date when uploaded
 * @param id Photo ID
 * @param ownerId Photo owner's ID
 * @param accessKey Access key for the photo
 * @param canComment no description
 * @param comments no description
 * @param height Original photo height
 * @param hidden Returns if the photo is hidden above the wall
 * @param lat Latitude
 * @param likes no description
 * @param long Longitude
 * @param photo1280 URL of image with 1280 px width
 * @param photo130 URL of image with 130 px width
 * @param photo2560 URL of image with 2560 px width
 * @param photo604 URL of image with 604 px width
 * @param photo75 URL of image with 75 px width
 * @param photo807 URL of image with 807 px width
 * @param postId Post ID
 * @param realOffset Real position of the photo
 * @param reposts no description
 * @param sizes no description
 * @param tags no description
 * @param text Photo caption
 * @param userId ID of the user who have uploaded the photo
 * @param width Original photo width
 */
data class PhotosPhotoFullXtrRealOffset(
    @SerializedName(value="album_id")
    val albumId: Int,
    @SerializedName(value="date")
    val date: Int,
    @SerializedName(value="id")
    val id: Int,
    @SerializedName(value="owner_id")
    val ownerId: Int,
    @SerializedName(value="access_key")
    val accessKey: String? = null,
    @SerializedName(value="can_comment")
    val canComment: BaseBoolInt? = null,
    @SerializedName(value="comments")
    val comments: BaseObjectCount? = null,
    @SerializedName(value="height")
    val height: Int? = null,
    @SerializedName(value="hidden")
    val hidden: BasePropertyExists? = null,
    @SerializedName(value="lat")
    val lat: Float? = null,
    @SerializedName(value="likes")
    val likes: BaseLikes? = null,
    @SerializedName(value="long")
    val long: Float? = null,
    @SerializedName(value="photo_1280")
    val photo1280: String? = null,
    @SerializedName(value="photo_130")
    val photo130: String? = null,
    @SerializedName(value="photo_2560")
    val photo2560: String? = null,
    @SerializedName(value="photo_604")
    val photo604: String? = null,
    @SerializedName(value="photo_75")
    val photo75: String? = null,
    @SerializedName(value="photo_807")
    val photo807: String? = null,
    @SerializedName(value="post_id")
    val postId: Int? = null,
    @SerializedName(value="real_offset")
    val realOffset: Int? = null,
    @SerializedName(value="reposts")
    val reposts: BaseObjectCount? = null,
    @SerializedName(value="sizes")
    val sizes: List<PhotosPhotoSizes>? = null,
    @SerializedName(value="tags")
    val tags: BaseObjectCount? = null,
    @SerializedName(value="text")
    val text: String? = null,
    @SerializedName(value="user_id")
    val userId: Int? = null,
    @SerializedName(value="width")
    val width: Int? = null
)
