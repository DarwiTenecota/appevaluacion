package com.darwinftb.prueba2m.Model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "canchaview")
class CanchaView {
    @Id
    @Column(updatable = false)
    var cancha: String? = null
    var frequency: Long? = null

}