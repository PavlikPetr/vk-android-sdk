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
package com.vk.sdk.api.messages.dto

import com.google.gson.annotations.SerializedName
import com.vk.sdk.api.groups.dto.GroupsGroup
import com.vk.sdk.api.users.dto.UsersUserFull
import kotlin.Boolean
import kotlin.Int
import kotlin.collections.List

/**
 * @param history no description
 * @param groups no description
 * @param messages no description
 * @param profiles no description
 * @param chats no description
 * @param newPts Persistence timestamp
 * @param more Has more
 * @param conversations no description
 */
data class MessagesGetLongPollHistoryResponseDto(
    @SerializedName(value="history")
    val history: List<List<Int>>? = null,
    @SerializedName(value="groups")
    val groups: List<GroupsGroup>? = null,
    @SerializedName(value="messages")
    val messages: MessagesLongpollMessages? = null,
    @SerializedName(value="profiles")
    val profiles: List<UsersUserFull>? = null,
    @SerializedName(value="chats")
    val chats: List<MessagesChat>? = null,
    @SerializedName(value="new_pts")
    val newPts: Int? = null,
    @SerializedName(value="more")
    val more: Boolean? = null,
    @SerializedName(value="conversations")
    val conversations: List<MessagesConversation>? = null
)
