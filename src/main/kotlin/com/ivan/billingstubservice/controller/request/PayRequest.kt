package com.ivan.billingstubservice.controller.request

data class PayRequest(
    val amount: Float,
    val cardNumber: String,
    val owner: String,
    val expirationTime: String,
    val cvvCode: Short,
)
