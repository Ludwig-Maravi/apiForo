package com.foro.apiForo.Servicio;
import com.foro.apiForo.Modelos.Topico;
import java.util.List;

public interface CRUD {
 //Metodo GET
    List<Topico> findAll();
    Topico findByID(Integer id);

    // Metodo POST
    Topico save(Topico topicos);

    //Metodo PUT
    Topico update(Integer id, Topico topicos);

    //Metodo DELETE
    void deleteById(Integer id);
}
