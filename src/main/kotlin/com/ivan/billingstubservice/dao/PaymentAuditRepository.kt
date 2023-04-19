package com.ivan.billingstubservice.dao

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PaymentAuditRepository: JpaRepository<PaymentAudit, Long>