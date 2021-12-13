package com.cursojavaee.jpa.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;

    @Column(length = 45)
    private String nombre;

    @Column(length = 45)
    private String apellido;

    @Column(length = 45, unique = true)
    private String email;

    @Column(length = 45)
    private String telefono;

    private Double saldo;

    @OneToOne
    @JoinColumn(name = "id")
    private Pasaporte pasaporte;

}