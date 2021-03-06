package com.cursojavaee.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Pasaporte implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer id;

    @Column(name = "numero")
    @Getter
    @Setter
    private String numero;

    @OneToOne(mappedBy = "pasaporte", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private Cliente cliente;
}
