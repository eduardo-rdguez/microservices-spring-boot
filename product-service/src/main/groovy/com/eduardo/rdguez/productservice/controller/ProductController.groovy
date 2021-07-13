package com.eduardo.rdguez.productservice.controller

import com.eduardo.rdguez.productservice.domain.Product
import com.eduardo.rdguez.productservice.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/product")
class ProductController {

  @Autowired
  ProductService productService

  @PostMapping("addOne")
  Product addProduct(@RequestBody Product product) {
    productService.addProduct(product)
  }

  @PostMapping("/addAll")
  List<Product> addAllProducts(@RequestBody List<Product> productList) {
    productService.addAllProducts(productList)
  }

  @GetMapping("/getAll")
  List<Product> getAllProducts() {
    productService.getAllProducts()
  }

  @GetMapping("/sendToCard/{productId}")
  ResponseEntity<Product> sendToCart(@PathVariable Long productId) {
    Product product = productService.sendToCart(productId)
    product
      ? new ResponseEntity<>(product, HttpStatus.OK)
      : new ResponseEntity<>(HttpStatus.NOT_FOUND)
  }

}
