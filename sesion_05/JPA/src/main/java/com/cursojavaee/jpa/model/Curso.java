package com.cursojavaee.jpa.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titulo;
    private Integer horas;

    @ManyToMany(mappedBy = "clienteCurso")
    private List<Cliente> clienteCurso;
}