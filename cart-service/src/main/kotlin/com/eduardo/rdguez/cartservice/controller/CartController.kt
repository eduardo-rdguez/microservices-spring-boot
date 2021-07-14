package com.eduardo.rdguez.cartservice.controller

import com.eduardo.rdguez.cartservice.domain.Product
import com.eduardo.rdguez.cartservice.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/cart")
class CartController {

  @Autowired
  lateinit var productService: ProductService

  @GetMapping("/getProducts")
  fun getAllProducts(): List<Product> {
    return productService.getAllProducts()
  }

  @DeleteMapping("delete/{productId}")
  fun deleteProduct(@PathVariable productId: Long) {
    productService.deleteProduct(productId)
  }

  @DeleteMapping("deleteAll")
  fun deleteProducts() {
    productService.deleteProducts()
  }

}