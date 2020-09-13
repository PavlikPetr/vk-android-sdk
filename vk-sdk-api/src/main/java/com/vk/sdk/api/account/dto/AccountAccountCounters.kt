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
package com.vk.sdk.api.account.dto

import com.google.gson.annotations.SerializedName
import kotlin.Int

/**
 * @param appRequests New app requests number
 * @param events New events number
 * @param faves New faves number
 * @param friends New friends requests number
 * @param friendsSuggestions New friends suggestions number
 * @param friendsRecommendations New friends recommendations number
 * @param gifts New gifts number
 * @param groups New groups number
 * @param menuDiscoverBadge 
 * @param messages New messages number
 * @param memories New memories number
 * @param notes New notes number
 * @param notifications New notifications number
 * @param photos New photo tags number
 * @param sdk New sdk number
 */
data class AccountAccountCounters(
    @SerializedName(value="app_requests")
    val appRequests: Int? = null,
    @SerializedName(value="events")
    val events: Int? = null,
    @SerializedName(value="faves")
    val faves: Int? = null,
    @SerializedName(value="friends")
    val friends: Int? = null,
    @SerializedName(value="friends_suggestions")
    val friendsSuggestions: Int? = null,
    @SerializedName(value="friends_recommendations")
    val friendsRecommendations: Int? = null,
    @SerializedName(value="gifts")
    val gifts: Int? = null,
    @SerializedName(value="groups")
    val groups: Int? = null,
    @SerializedName(value="menu_discover_badge")
    val menuDiscoverBadge: Int? = null,
    @SerializedName(value="messages")
    val messages: Int? = null,
    @SerializedName(value="memories")
    val memories: Int? = null,
    @SerializedName(value="notes")
    val notes: Int? = null,
    @SerializedName(value="notifications")
    val notifications: Int? = null,
    @SerializedName(value="photos")
    val photos: Int? = null,
    @SerializedName(value="sdk")
    val sdk: Int? = null
)
