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
package com.vk.sdk.api.wall.dto

import com.google.gson.annotations.SerializedName
import com.vk.sdk.api.base.dto.BaseLikesInfo
import com.vk.sdk.api.base.dto.BaseRepostsInfo
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * @param accessKey Access key to private object
 * @param attachments no description
 * @param copyright Information about the source of the post
 * @param date Date of publishing in Unixtime
 * @param edited Date of editing in Unixtime
 * @param fromId Post author ID
 * @param geo no description
 * @param id Post ID
 * @param isArchived Is post archived, only for post owners
 * @param isFavorite Information whether the post in favorites list
 * @param likes Count of likes
 * @param ownerId Wall owner's ID
 * @param postSource no description
 * @param postType no description
 * @param reposts no description
 * @param signerId Post signer ID
 * @param text Post text
 * @param views Count of views
 */
data class WallWallpost(
    @SerializedName(value="access_key")
    val accessKey: String? = null,
    @SerializedName(value="attachments")
    val attachments: List<WallWallpostAttachment>? = null,
    @SerializedName(value="copyright")
    val copyright: WallPostCopyright? = null,
    @SerializedName(value="date")
    val date: Int? = null,
    @SerializedName(value="edited")
    val edited: Int? = null,
    @SerializedName(value="from_id")
    val fromId: Int? = null,
    @SerializedName(value="geo")
    val geo: WallGeo? = null,
    @SerializedName(value="id")
    val id: Int? = null,
    @SerializedName(value="is_archived")
    val isArchived: Boolean? = null,
    @SerializedName(value="is_favorite")
    val isFavorite: Boolean? = null,
    @SerializedName(value="likes")
    val likes: BaseLikesInfo? = null,
    @SerializedName(value="owner_id")
    val ownerId: Int? = null,
    @SerializedName(value="post_source")
    val postSource: WallPostSource? = null,
    @SerializedName(value="post_type")
    val postType: WallPostType? = null,
    @SerializedName(value="reposts")
    val reposts: BaseRepostsInfo? = null,
    @SerializedName(value="signer_id")
    val signerId: Int? = null,
    @SerializedName(value="text")
    val text: String? = null,
    @SerializedName(value="views")
    val views: WallViews? = null
)
