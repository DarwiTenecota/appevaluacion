package com.darwinftb.prueba2m.Repository

import com.darwinftb.prueba2m.Model.Jugador
import org.springframework.data.jpa.repository.JpaRepository

interface JugadorRepository: JpaRepository<Jugador, Long> {
    fun findById(id: Long?): Jugador
}