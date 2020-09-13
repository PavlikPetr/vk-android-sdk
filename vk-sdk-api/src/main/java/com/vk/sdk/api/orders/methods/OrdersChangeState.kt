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
package com.vk.sdk.api.orders.methods

import com.vk.api.sdk.requests.VKRequest
import com.vk.sdk.api.GsonHolder
import com.vk.sdk.api.orders.dto.OrdersChangeStateAction
import com.vk.sdk.api.orders.responses.OrdersChangeStateResponse
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import org.json.JSONObject

/**
 * Changes order status.
 * @param orderId order ID. minimum 0
 * @param action action to be done with the order. Available actions: *cancel � to cancel
 * unconfirmed order. *charge � to confirm unconfirmed order. Applies only if processing of
 * [vk.com/dev/payments_status|order_change_state] notification failed. *refund � to cancel confirmed
 * order. 
 * @param appOrderId internal ID of the order in the application. minimum 0
 * @param testMode if this parameter is set to 1, this method returns a list of test mode orders. By
 * default � 0. 
 */
class OrdersChangeState(
    private val orderId: Int,
    private val action: OrdersChangeStateAction,
    private val appOrderId: Int? = null,
    private val testMode: Boolean? = null
) : VKRequest<String>("orders.changeState") {
    init {
        addParam("order_id", orderId)
        addParam("action", action.value)
        appOrderId?.let { value ->
            addParam("app_order_id", value)
        }
        testMode?.let { value ->
            addParam("test_mode", if (value) 1 else 0)
        }
    }

    override fun parse(r: JSONObject): String = GsonHolder.gson.fromJson(r.toString(),
            OrdersChangeStateResponse::class.java).response
}
