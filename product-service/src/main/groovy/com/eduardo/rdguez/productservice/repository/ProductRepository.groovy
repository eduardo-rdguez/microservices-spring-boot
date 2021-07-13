package com.eduardo.rdguez.productservice.repository

import com.eduardo.rdguez.productservice.domain.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository extends JpaRepository<Product, Long> {

  Product findById(Long id)

}
