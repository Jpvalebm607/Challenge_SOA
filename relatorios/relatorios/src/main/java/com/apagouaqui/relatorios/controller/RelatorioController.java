package com.apagouaqui.relatorios.controller;

import com.apagouaqui.relatorios.dto.AlertaDTO;
import com.apagouaqui.relatorios.service.RelatorioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/relatorios")
public class RelatorioController {

    private final RelatorioService service;

    public RelatorioController(RelatorioService service) {
        this.service = service;
    }

    @GetMapping("/alertas")
    public List<AlertaDTO> relatorioAlertas() {
        return service.obterRelatorioAlertas();
    }
}
