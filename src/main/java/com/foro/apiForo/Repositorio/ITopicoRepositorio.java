package com.foro.apiForo.Repositorio;

import org.springframework.stereotype.Repository;
import com.foro.apiForo.Modelos.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public abstract class ITopicoRepositorio implements JpaRepository<Topico, Integer> {
}
