package com.darwinftb.prueba2m.Model

import javax.persistence.*

@Entity
@Table(name = "jugador")

class Jugador {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var nombre: String? = null
    var hora : String? = null
    var cancha : String? = null

}