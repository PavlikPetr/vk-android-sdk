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
package com.vk.sdk.api.ads.dto

import com.google.gson.annotations.SerializedName
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * @param age no description
 * @param cities no description
 * @param day Day as YYYY-MM-DD
 * @param month Month as YYYY-MM
 * @param overall 1 if period=overall
 * @param sex no description
 * @param sexAge no description
 */
data class AdsDemostatsFormat(
    @SerializedName(value="age")
    val age: List<AdsStatsAge>? = null,
    @SerializedName(value="cities")
    val cities: List<AdsStatsCities>? = null,
    @SerializedName(value="day")
    val day: String? = null,
    @SerializedName(value="month")
    val month: String? = null,
    @SerializedName(value="overall")
    val overall: Int? = null,
    @SerializedName(value="sex")
    val sex: List<AdsStatsSex>? = null,
    @SerializedName(value="sex_age")
    val sexAge: List<AdsStatsSexAge>? = null
)
