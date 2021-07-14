package com.eduardo.rdguez.cartservice.service

import com.eduardo.rdguez.cartservice.domain.Product

interface ProductService {

  fun addProduct(product: Product): Product

  fun getAllProducts(): List<Product>

  fun deleteProduct(id: Long)

  fun deleteProducts()

}