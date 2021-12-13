package com.cursojavaee.jpa.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    @Getter
    @Setter
    private Integer id;

    @Column(length = 45)
    @Getter
    @Setter
    private String nombre;

    @Column(length = 45)
    @Getter
    @Setter
    private String apellido;

    @Column(length = 45, unique = true)
    @Getter
    @Setter
    private String email;

    @Column(length = 45)
    @Getter
    @Setter
    private String telefono;

    @Getter
    @Setter
    private Double saldo;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "pasaporte_id")
    private Pasaporte pasaporte;

    @OneToMany(mappedBy = "cliente")
    @Getter
    private List<Factura> facturas = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "cliente_curso",
            joinColumns = @JoinColumn(name = "cliente_id"),
            inverseJoinColumns = @JoinColumn(name = "curso_id")
    )
    List<Curso> clienteCurso;

}