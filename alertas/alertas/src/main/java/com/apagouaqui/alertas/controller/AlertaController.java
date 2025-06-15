package com.apagouaqui.alertas.controller;

import com.apagouaqui.alertas.model.Alerta;
import com.apagouaqui.alertas.service.AlertaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alertas")
public class AlertaController {

    private final AlertaService service;

    public AlertaController(AlertaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Alerta> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Alerta salvar(@RequestBody Alerta alerta) {
        return service.salvar(alerta);
    }
}
