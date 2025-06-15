package com.apagouaqui.alertas.repository;

import com.apagouaqui.alertas.model.Alerta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertaRepository extends JpaRepository<Alerta, Long> {}
