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
package com.vk.sdk.api.pages.dto

import com.google.gson.annotations.SerializedName
import com.vk.sdk.api.base.dto.BaseBoolInt
import kotlin.Int
import kotlin.String

/**
 * @param created Date when the page has been created in Unixtime
 * @param edited Date when the page has been edited in Unixtime
 * @param groupId Community ID
 * @param id Page ID
 * @param title Page title
 * @param viewUrl URL of the page preview
 * @param views Views number
 * @param whoCanEdit Edit settings of the page
 * @param whoCanView View settings of the page
 * @param creatorId Page creator ID
 * @param currentUserCanEdit Information whether current user can edit the page
 * @param currentUserCanEditAccess Information whether current user can edit the page access
 * settings
 * @param editorId Last editor ID
 * @param html Page content, HTML
 * @param source Page content, wiki
 */
data class PagesWikipageFull(
    @SerializedName(value="created")
    val created: Int,
    @SerializedName(value="edited")
    val edited: Int,
    @SerializedName(value="group_id")
    val groupId: Int,
    @SerializedName(value="id")
    val id: Int,
    @SerializedName(value="title")
    val title: String,
    @SerializedName(value="view_url")
    val viewUrl: String,
    @SerializedName(value="views")
    val views: Int,
    @SerializedName(value="who_can_edit")
    val whoCanEdit: PagesPrivacySettings,
    @SerializedName(value="who_can_view")
    val whoCanView: PagesPrivacySettings,
    @SerializedName(value="creator_id")
    val creatorId: Int? = null,
    @SerializedName(value="current_user_can_edit")
    val currentUserCanEdit: BaseBoolInt? = null,
    @SerializedName(value="current_user_can_edit_access")
    val currentUserCanEditAccess: BaseBoolInt? = null,
    @SerializedName(value="editor_id")
    val editorId: Int? = null,
    @SerializedName(value="html")
    val html: String? = null,
    @SerializedName(value="source")
    val source: String? = null
)
