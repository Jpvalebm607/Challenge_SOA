package com.apagouaqui.alertas.service;

import com.apagouaqui.alertas.model.Alerta;
import com.apagouaqui.alertas.repository.AlertaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertaService {

    private final AlertaRepository repository;

    public AlertaService(AlertaRepository repository) {
        this.repository = repository;
    }

    public List<Alerta> listarTodos() {
        return repository.findAll();
    }

    public Alerta salvar(Alerta alerta) {
        return repository.save(alerta);
    }
}
