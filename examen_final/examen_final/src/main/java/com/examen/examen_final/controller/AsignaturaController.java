package com.examen.examen_final.controller;

import com.examen.examen_final.models.Asignatura;
import com.examen.examen_final.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/asignaturas")
public class AsignaturaController {
    @Autowired
    private AsignaturaRepository repository;

    @PostMapping("/asignatura")
    public Asignatura create(@Validated @RequestBody Asignatura p){
        return repository.insert(p);
    }

    @GetMapping("/")
    public List<Asignatura> readAll(){
        return repository.findAll();
    }

    @PutMapping("/asignatura/{id}")
    public Asignatura update(@PathVariable Long id, @Validated @RequestBody Asignatura p){
        return repository.save(p);
    }

    @DeleteMapping("/asignatura/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}
