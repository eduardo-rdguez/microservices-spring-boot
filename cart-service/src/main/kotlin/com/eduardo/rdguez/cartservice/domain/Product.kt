package com.eduardo.rdguez.cartservice.domain

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Product(

  @Id
  var id: Long,
  var name: String,
  var price: Double

)