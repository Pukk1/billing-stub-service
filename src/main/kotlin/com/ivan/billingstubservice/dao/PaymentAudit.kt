package com.ivan.billingstubservice.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class PaymentAudit(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val amount: Float,
    val cardNumber: String,
    val owner: String,
    val expirationTime: String,
    val cvvCode: Short,
)
