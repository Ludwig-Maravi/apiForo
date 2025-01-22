package com.foro.apiForo.Servicio;

import com.foro.apiForo.Repositorio.ITopicoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.foro.apiForo.Modelos.Topico;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TopicoServicio  implements CRUD {

    private final ITopicoRepositorio repositorio;
    private Integer id;

    public TopicoServicio(ITopicoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Topico> findAll() {
        return repositorio.findAll();
    }

    @Override
    public Topico findByID(Integer id) {
        return null;
    }

    @Override
    public Topico save(Topico topicos) {
        return repositorio.findById(id).orElseThrow();
    }

    @Override
    public Topico update(Integer id, Topico topicos) {
        topicos.setId(id);
        return repositorio.save(topicos);
    }

    @Override
    public void deleteById(Integer id) {
        repositorio.deleteById(id);
    }


}
