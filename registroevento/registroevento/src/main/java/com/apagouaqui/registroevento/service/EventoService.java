package com.apagouaqui.registroevento.service;

import com.apagouaqui.registroevento.model.Evento;
import com.apagouaqui.registroevento.repository.EventoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {

    private final EventoRepository repository;

    public EventoService(EventoRepository repository) {
        this.repository = repository;
    }

    public List<Evento> listarTodos() {
        return repository.findAll();
    }

    public Evento salvar(Evento evento) {
        return repository.save(evento);
    }
}
