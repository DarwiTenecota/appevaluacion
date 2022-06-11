package com.darwinftb.prueba2m.Controller

import com.darwinftb.prueba2m.Model.CanchaView
import com.darwinftb.prueba2m.Model.HoraView
import com.darwinftb.prueba2m.Model.Jugador
import com.darwinftb.prueba2m.Service.JugadorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/jugador")
class JugadorController {
    @Autowired
    lateinit var jugadorService: JugadorService

    @GetMapping
    fun list():List<Jugador>

    {
        return jugadorService.list()
    }

    @GetMapping("frequency/hora")
    fun ListHoraView (): List<HoraView>? {
        return jugadorService.listHoraView()
    }

    @GetMapping("frequency/cancha")

    fun ListCanchaView (): List<CanchaView>? {
        return jugadorService.listCanchaView()
    }
    @PostMapping
    fun save(@RequestBody jugador: Jugador): Jugador {
        return jugadorService.save(jugador)
    }
}

