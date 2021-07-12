package com.eduardo.rdguez.productservice.controller

import com.eduardo.rdguez.productservice.domain.Product
import com.eduardo.rdguez.productservice.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/product")
class ProductController {

  @Autowired
  ProductRepository productRepository

  @PostMapping("addOne")
  Product addProduct(@RequestBody Product product) {
    productRepository.save(product)
  }

  @PostMapping("/addAll")
  List<Product> addAllProducts(@RequestBody List<Product> productList) {
    productRepository.saveAll(productList)
  }

  @GetMapping("/getAll")
  List<Product> getAllProducts() {
    productRepository.findAll()
  }

}
