package com.eduardo.rdguez.productservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class ProductServiceApplication {

  static void main(String[] args) {
    SpringApplication.run(ProductServiceApplication, args)
  }

}
