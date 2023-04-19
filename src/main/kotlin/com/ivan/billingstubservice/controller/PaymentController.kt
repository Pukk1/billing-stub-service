package com.ivan.billingstubservice.controller

import com.ivan.billingstubservice.controller.request.PayRequest
import com.ivan.billingstubservice.controller.response.PayResponse
import com.ivan.billingstubservice.service.StubPaymentService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/payment")
class PaymentController(
    val stubPaymentService: StubPaymentService,
) {
    @PostMapping("pay-request")
    fun pay(@RequestBody payRequest: PayRequest): PayResponse {
        stubPaymentService.saveAudit(payRequest)
        return PayResponse("https://www.google.com/")
    }
}