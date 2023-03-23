package com.examen.examen_final.controller;

import com.examen.examen_final.models.Periodo;
import com.examen.examen_final.repository.PeriodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/periodos")
public class PeriodoController {
    @Autowired
    private PeriodoRepository repository;

    @PostMapping("/periodo")
    public Periodo create(@Validated @RequestBody Periodo p){
        return repository.insert(p);
    }

    @GetMapping("/")
    public List<Periodo> readAll(){
        return repository.findAll();
    }

    @PutMapping("/periodo/{id}")
    public Periodo update(@PathVariable Long id, @Validated @RequestBody Periodo p){
        return repository.save(p);
    }

    @DeleteMapping("/periodo/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}
