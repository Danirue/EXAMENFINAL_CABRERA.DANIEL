package com.examen.examen_final.controller;

import com.examen.examen_final.models.Carrera;
import com.examen.examen_final.repository.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/carreras")
public class CarreraController {
    @Autowired
    private CarreraRepository repository;

    @PostMapping("/carrera")
    public Carrera create(@Validated @RequestBody Carrera p){
        return repository.insert(p);
    }

    @GetMapping("/")
    public List<Carrera> readAll(){
        return repository.findAll();
    }

    @PutMapping("/carrera/{id}")
    public Carrera update(@PathVariable Long id, @Validated @RequestBody Carrera p){
        return repository.save(p);
    }

    @DeleteMapping("/carrera/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}
