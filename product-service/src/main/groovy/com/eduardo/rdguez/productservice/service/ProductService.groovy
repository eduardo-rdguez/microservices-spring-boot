package com.eduardo.rdguez.productservice.service

import com.eduardo.rdguez.productservice.domain.Product

interface ProductService {

  Product addProduct(Product product)

  List<Product> addAllProducts(List<Product> productList)

  List<Product> getAllProducts()

  Product sendToCart(Long productId)

}