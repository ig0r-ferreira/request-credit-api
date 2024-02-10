package me.dio.credit.api.service

import me.dio.credit.api.entity.Credit
import java.util.UUID

interface ICreditService {
    fun save(credit: Credit): Credit
    fun findByCustomerId(customerId: Long): List<Credit>
    fun findByCreditCode(creditCode: UUID): Credit
}