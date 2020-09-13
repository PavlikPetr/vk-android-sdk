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
package com.vk.sdk.api.groups.dto

import com.google.gson.annotations.SerializedName

/**
 * @param fri Timetable for friday
 * @param mon Timetable for monday
 * @param sat Timetable for saturday
 * @param sun Timetable for sunday
 * @param thu Timetable for thursday
 * @param tue Timetable for tuesday
 * @param wed Timetable for wednesday
 */
data class GroupsAddressTimetable(
    @SerializedName(value="fri")
    val fri: GroupsAddressTimetableDay? = null,
    @SerializedName(value="mon")
    val mon: GroupsAddressTimetableDay? = null,
    @SerializedName(value="sat")
    val sat: GroupsAddressTimetableDay? = null,
    @SerializedName(value="sun")
    val sun: GroupsAddressTimetableDay? = null,
    @SerializedName(value="thu")
    val thu: GroupsAddressTimetableDay? = null,
    @SerializedName(value="tue")
    val tue: GroupsAddressTimetableDay? = null,
    @SerializedName(value="wed")
    val wed: GroupsAddressTimetableDay? = null
)
