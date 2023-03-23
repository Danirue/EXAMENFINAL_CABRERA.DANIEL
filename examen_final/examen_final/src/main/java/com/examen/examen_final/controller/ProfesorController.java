package com.examen.examen_final.controller;

import com.examen.examen_final.models.Profesor;
import com.examen.examen_final.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/profesores")
public class ProfesorController {

    @Autowired
    private ProfesorRepository repository;

    @PostMapping("/profesor")
    public Profesor create(@Validated @RequestBody Profesor p){
        return repository.insert(p);
    }

    @GetMapping("/")
    public List<Profesor> readAll(){
        return repository.findAll();
    }

    @PutMapping("/profesor/{id}")
    public Profesor update(@PathVariable Long id, @Validated @RequestBody Profesor p){
        return repository.save(p);
    }

    @DeleteMapping("/Profesor/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}
