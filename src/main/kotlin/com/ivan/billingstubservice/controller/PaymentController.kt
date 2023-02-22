package com.ivan.billingstubservice.controller

import com.ivan.billingstubservice.controller.request.PayRequest
import com.ivan.billingstubservice.controller.response.PayResponse
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/payment")
class PaymentController {
    @PostMapping("pay-request")
    fun pay(@RequestBody payRequest: PayRequest): PayResponse {
        return PayResponse("https://www.google.com/")
    }
}