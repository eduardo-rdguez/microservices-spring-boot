package com.eduardo.rdguez.productservice.service

import com.eduardo.rdguez.productservice.domain.Product
import com.eduardo.rdguez.productservice.repository.ProductRepository
import groovy.json.JsonBuilder
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.jms.core.JmsTemplate
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl implements ProductService {

  @Autowired
  ProductRepository productRepository

  @Autowired
  JmsTemplate jmsTemplate

  @Value('${application.jms.destination}')
  String jmsQueue

  @Override
  Product addProduct(Product product) {
    productRepository.save(product)
  }

  @Override
  List<Product> addAllProducts(List<Product> productList) {
    productRepository.saveAll(productList)
  }

  @Override
  List<Product> getAllProducts() {
    productRepository.findAll()
  }

  @Override
  Product sendToCart(Long productId) {
    Product product = productRepository.findById(productId)
    if (product) {
      String jsonInString = new JsonBuilder(product).toPrettyString()
      jmsTemplate.convertAndSend(jmsQueue, jsonInString)
    }
    product
  }

}
