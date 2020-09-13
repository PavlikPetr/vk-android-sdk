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
package com.vk.sdk.api.polls.methods

import com.vk.api.sdk.requests.VKRequest
import com.vk.sdk.api.GsonHolder
import com.vk.sdk.api.base.dto.BaseBoolInt
import com.vk.sdk.api.polls.responses.PollsAddVoteResponse
import kotlin.Boolean
import kotlin.Int
import kotlin.collections.List
import org.json.JSONObject

/**
 * Adds the current user's vote to the selected answer in the poll.
 * @param pollId Poll ID. minimum 0
 * @param answerIds  
 * @param ownerId ID of the user or community that owns the poll. Use a negative value to designate
 * a community ID. 
 * @param isBoard  
 */
class PollsAddVote(
    private val pollId: Int,
    private val answerIds: List<Int>,
    private val ownerId: Int? = null,
    private val isBoard: Boolean? = null
) : VKRequest<BaseBoolInt>("polls.addVote") {
    init {
        addParam("poll_id", pollId)
        addParam("answer_ids", answerIds)
        ownerId?.let { value ->
            addParam("owner_id", value)
        }
        isBoard?.let { value ->
            addParam("is_board", if (value) 1 else 0)
        }
    }

    override fun parse(r: JSONObject): BaseBoolInt = GsonHolder.gson.fromJson(r.toString(),
            PollsAddVoteResponse::class.java).response
}
