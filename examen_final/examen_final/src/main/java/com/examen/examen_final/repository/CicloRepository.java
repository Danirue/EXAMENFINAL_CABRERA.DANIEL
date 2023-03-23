package com.examen.examen_final.repository;

import com.examen.examen_final.models.Ciclo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CicloRepository extends MongoRepository<Ciclo, Long> {
}
