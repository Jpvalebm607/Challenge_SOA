package com.apagouaqui.registroevento.repository;

import com.apagouaqui.registroevento.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {}
