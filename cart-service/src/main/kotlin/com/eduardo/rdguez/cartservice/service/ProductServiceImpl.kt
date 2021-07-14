package com.eduardo.rdguez.cartservice.service

import com.eduardo.rdguez.cartservice.domain.Product
import com.eduardo.rdguez.cartservice.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl : ProductService {

  @Autowired
  lateinit var productRepository: ProductRepository

  override fun addProduct(product: Product): Product {
    return productRepository.save(product)
  }

  override fun getAllProducts(): List<Product> {
    return productRepository.findAll()
  }

  override fun deleteProduct(id: Long) {
    productRepository.deleteById(id)
  }

  override fun deleteProducts() {
    productRepository.deleteAll()
  }

}