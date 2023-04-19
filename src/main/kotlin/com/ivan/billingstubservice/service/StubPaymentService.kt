package com.ivan.billingstubservice.service

import com.ivan.billingstubservice.controller.request.PayRequest
import com.ivan.billingstubservice.dao.PaymentAudit
import com.ivan.billingstubservice.dao.PaymentAuditRepository
import org.springframework.stereotype.Service

@Service
class StubPaymentService(
    private val paymentAuditRepository: PaymentAuditRepository
) {

    fun saveAudit(
        request: PayRequest
    ) = paymentAuditRepository.save(
        PaymentAudit(
            id = 0L,
            amount = request.amount,
            cardNumber = request.cardNumber,
            owner = request.owner,
            expirationTime = request.expirationTime,
            cvvCode = request.cvvCode
        )
    )
}
