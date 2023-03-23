package com.examen.examen_final.repository;

import com.examen.examen_final.models.Carrera;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraRepository extends MongoRepository<Carrera, Long> {
}
