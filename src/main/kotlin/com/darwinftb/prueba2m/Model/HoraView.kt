package com.darwinftb.prueba2m.Model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "horaview")
class HoraView {
    @Id
    @Column(updatable = false)
    var hora: String? = null
    var frequency: Long? = null
}
