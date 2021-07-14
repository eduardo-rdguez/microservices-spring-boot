package com.eduardo.rdguez.cartservice.listener

import com.eduardo.rdguez.cartservice.domain.Product
import com.eduardo.rdguez.cartservice.service.ProductService
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jms.annotation.JmsListener
import org.springframework.stereotype.Component

@Component
class JmsListener {

  @Autowired
  lateinit var productService: ProductService

  @JmsListener(destination = "\${product.jms.destination}")
  fun consumeMessage(jsonData: String) {
    val product: Product = ObjectMapper().readValue<Product>(jsonData)
    productService.addProduct(product)
  }

}