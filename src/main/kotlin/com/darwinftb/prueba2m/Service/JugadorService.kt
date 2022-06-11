package com.darwinftb.prueba2m.Service

import com.darwinftb.prueba2m.Model.CanchaView
import com.darwinftb.prueba2m.Model.HoraView
import com.darwinftb.prueba2m.Model.Jugador
import com.darwinftb.prueba2m.Repository.CanchaViewRepository
import com.darwinftb.prueba2m.Repository.HoraViewRepository
import com.darwinftb.prueba2m.Repository.JugadorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class JugadorService {
    @Autowired
    lateinit var jugadorRepository: JugadorRepository

    @Autowired
    lateinit var horaViewRepository: HoraViewRepository

    @Autowired
    lateinit var canchaViewRepository: CanchaViewRepository

    fun list(): List<Jugador> {
        return jugadorRepository.findAll()
    }

    fun listHoraView(): List<HoraView> {
        return horaViewRepository.findAll()
    }

    fun listCanchaView(): List<CanchaView> {
        return canchaViewRepository.findAll()
    }

    fun save(jugador: Jugador): Jugador {
        try {
            jugador.nombre?.takeIf { it.trim().isNotEmpty() }
                ?: throw Exception("No puede estar vacio")
            jugador.hora?.takeIf { it.trim().isNotEmpty() }
                ?: throw Exception("No puede estar vacio")
            jugador.cancha?.takeIf { it.trim().isNotEmpty() }
                ?: throw Exception("No puede estar vacio")


        } catch (ex: Exception) {
            throw ResponseStatusException(
                HttpStatus.NOT_FOUND, ex.message, ex
            )
        }
        return jugadorRepository.save(jugador)
    }
}

