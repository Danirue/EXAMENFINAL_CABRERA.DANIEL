package com.examen.examen_final.controller;

import com.examen.examen_final.models.Ciclo;
import com.examen.examen_final.repository.CicloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/ciclos")
public class CicloController {
    @Autowired
    private CicloRepository repository;

    @PostMapping("/ciclo")
    public Ciclo create(@Validated @RequestBody Ciclo p){
        return repository.insert(p);
    }

    @GetMapping("/")
    public List<Ciclo> readAll(){
        return repository.findAll();
    }

    @PutMapping("/ciclo/{id}")
    public Ciclo update(@PathVariable Long id, @Validated @RequestBody Ciclo p){
        return repository.save(p);
    }

    @DeleteMapping("/ciclo/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}
