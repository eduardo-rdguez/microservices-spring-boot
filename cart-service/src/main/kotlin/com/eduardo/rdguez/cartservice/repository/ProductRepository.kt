package com.eduardo.rdguez.cartservice.repository

import com.eduardo.rdguez.cartservice.domain.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : JpaRepository<Product, Long> {

}