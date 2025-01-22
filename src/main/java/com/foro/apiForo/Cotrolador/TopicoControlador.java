package com.foro.apiForo.Cotrolador;

import com.foro.apiForo.Servicio.TopicoServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.foro.apiForo.Modelos.Topico;
import org.springframework.web.service.annotation.PutExchange;

import java.util.List;

@RestController
@RequestMapping("api/topico")
@RequiredArgsConstructor
public class TopicoControlador {
    @Autowired
    TopicoServicio service;


    //Metodo GET
    @GetMapping
    public ResponseEntity<List<Topico>>findAll(){
        List <Topico> respuestaHttp = service.findAll();
        return new ResponseEntity<>(respuestaHttp, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Topico> findById(@PathVariable Integer id){

        Topico respuestaHttp = service.findByID(id);
        return new ResponseEntity<>(respuestaHttp, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Topico> save(@RequestBody Topico topicos){

        Topico respuestaHttp = service.save(topicos);
        return new ResponseEntity<>(respuestaHttp, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Topico> update(@PathVariable Integer id, @RequestBody Topico topicos){
        topicos.setId(id);
        Topico respuestaHttp = service.save(topicos);
        return new ResponseEntity<>(respuestaHttp, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id){
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
