package com.apagouaqui.registroevento.controller;

import com.apagouaqui.registroevento.model.Evento;
import com.apagouaqui.registroevento.service.EventoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    private final EventoService service;

    public EventoController(EventoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Evento> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Evento salvar(@RequestBody Evento evento) {
        return service.salvar(evento);
    }
}
