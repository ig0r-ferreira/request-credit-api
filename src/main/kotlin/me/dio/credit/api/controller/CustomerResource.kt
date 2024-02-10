package me.dio.credit.api.controller

import me.dio.credit.api.dto.CustomerDTO
import me.dio.credit.api.service.impl.CustomerService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/customers")
class CustomerResource (
    private val customerService: CustomerService
) {
    @PostMapping
    fun saveCustomer(@RequestBody customerDTO: CustomerDTO): String {
        val customerEmail = this.customerService.save(customerDTO.toEntity()).email
        return "Customer $customerEmail saved!"
    }
}