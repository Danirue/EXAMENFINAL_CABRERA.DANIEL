package com.examen.examen_final.repository;

import com.examen.examen_final.models.Asignatura;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignaturaRepository extends MongoRepository<Asignatura, Long> {
}
