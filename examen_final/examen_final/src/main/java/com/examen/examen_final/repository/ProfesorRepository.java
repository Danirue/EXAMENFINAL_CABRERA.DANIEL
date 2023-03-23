package com.examen.examen_final.repository;

import com.examen.examen_final.models.Profesor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends MongoRepository<Profesor, Long> {
}
