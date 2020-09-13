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
package com.vk.sdk.api.appWidgets.methods

import com.vk.api.sdk.requests.VKRequest
import com.vk.sdk.api.GsonHolder
import com.vk.sdk.api.appWidgets.dto.AppWidgetsGetAppImageUploadServerImageType
import com.vk.sdk.api.appWidgets.dto.AppWidgetsGetAppImageUploadServerResponseDto
import com.vk.sdk.api.appWidgets.responses.AppWidgetsGetAppImageUploadServerResponse
import org.json.JSONObject

/**
 * Returns a URL for uploading a photo to the community collection for community app widgets
 * @param imageType  
 */
class AppWidgetsGetAppImageUploadServer(
    private val imageType: AppWidgetsGetAppImageUploadServerImageType
) : VKRequest<AppWidgetsGetAppImageUploadServerResponseDto>("appWidgets.getAppImageUploadServer") {
    init {
        addParam("image_type", imageType.value)
    }

    override fun parse(r: JSONObject): AppWidgetsGetAppImageUploadServerResponseDto =
            GsonHolder.gson.fromJson(r.toString(),
            AppWidgetsGetAppImageUploadServerResponse::class.java).response
}
