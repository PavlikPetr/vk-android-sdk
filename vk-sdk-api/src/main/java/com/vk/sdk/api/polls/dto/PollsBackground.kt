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
package com.vk.sdk.api.polls.dto

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.annotations.SerializedName
import com.vk.sdk.api.base.dto.BaseGradientPoint
import com.vk.sdk.api.base.dto.BaseImage
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * @param angle Gradient angle with 0 on positive X axis
 * @param color Hex color code without #
 * @param height Original height of pattern tile
 * @param id no description
 * @param name no description
 * @param images Pattern tiles
 * @param points Gradient points
 * @param type no description
 * @param width Original with of pattern tile
 */
data class PollsBackground(
    @SerializedName(value="angle")
    val angle: Int? = null,
    @SerializedName(value="color")
    val color: String? = null,
    @SerializedName(value="height")
    val height: Int? = null,
    @SerializedName(value="id")
    val id: Int? = null,
    @SerializedName(value="name")
    val name: String? = null,
    @SerializedName(value="images")
    val images: List<BaseImage>? = null,
    @SerializedName(value="points")
    val points: List<BaseGradientPoint>? = null,
    @SerializedName(value="type")
    val type: Type? = null,
    @SerializedName(value="width")
    val width: Int? = null
) {
    enum class Type(
        val value: String
    ) {
        GRADIENT("gradient"),

        TILE("tile");

        class Serializer : JsonDeserializer<Type> {
            override fun deserialize(
                json: JsonElement?,
                typeOfT: java.lang.reflect.Type?,
                context: JsonDeserializationContext?
            ): Type = values().first { it.value.toString() == json!!.asJsonPrimitive.toString() }
        }
    }
}
