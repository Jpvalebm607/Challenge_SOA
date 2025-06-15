package com.apagouaqui.relatorios.service;

import com.apagouaqui.relatorios.dto.AlertaDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class RelatorioService {

    private final RestTemplate restTemplate;

    public RelatorioService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<AlertaDTO> obterRelatorioAlertas() {
        String url = "http://localhost:8082/alertas";
        AlertaDTO[] alertas = restTemplate.getForObject(url, AlertaDTO[].class);
        return Arrays.asList(alertas);
    }
}
