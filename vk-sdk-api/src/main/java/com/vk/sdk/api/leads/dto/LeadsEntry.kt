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
package com.vk.sdk.api.leads.dto

import com.google.gson.annotations.SerializedName
import com.vk.sdk.api.base.dto.BaseBoolInt
import kotlin.Int
import kotlin.String

/**
 * @param aid Application ID
 * @param comment Comment text
 * @param date Date when the action has been started in Unixtime
 * @param sid Session string ID
 * @param startDate Start date in Unixtime (for status=2)
 * @param status Action type
 * @param testMode Information whether test mode is enabled
 * @param uid User ID
 */
data class LeadsEntry(
    @SerializedName(value="aid")
    val aid: Int? = null,
    @SerializedName(value="comment")
    val comment: String? = null,
    @SerializedName(value="date")
    val date: Int? = null,
    @SerializedName(value="sid")
    val sid: String? = null,
    @SerializedName(value="start_date")
    val startDate: Int? = null,
    @SerializedName(value="status")
    val status: Int? = null,
    @SerializedName(value="test_mode")
    val testMode: BaseBoolInt? = null,
    @SerializedName(value="uid")
    val uid: Int? = null
)
