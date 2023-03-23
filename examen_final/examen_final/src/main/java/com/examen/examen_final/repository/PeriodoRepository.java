package com.examen.examen_final.repository;

import com.examen.examen_final.models.Periodo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodoRepository extends MongoRepository<Periodo, Long> {
}
