package com.ivan.billingstubservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BillingStubServiceApplication

fun main(args: Array<String>) {
	runApplication<BillingStubServiceApplication>(*args)
}
