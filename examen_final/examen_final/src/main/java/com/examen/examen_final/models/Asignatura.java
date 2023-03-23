package com.examen.examen_final.models;

import lombok.Data;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Asignaturas")
public class Asignatura {
    @Id
    private Long id;
    private String nombre;
    private int n_horas;
    private int n_horas_practicas;
    private int n_horas_autonomas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getN_horas() {
        return n_horas;
    }

    public void setN_horas(int n_horas) {
        this.n_horas = n_horas;
    }

    public int getN_horas_practicas() {
        return n_horas_practicas;
    }

    public void setN_horas_practicas(int n_horas_practicas) {
        this.n_horas_practicas = n_horas_practicas;
    }

    public int getN_horas_autonomas() {
        return n_horas_autonomas;
    }

    public void setN_horas_autonomas(int n_horas_autonomas) {
        this.n_horas_autonomas = n_horas_autonomas;
    }
}
