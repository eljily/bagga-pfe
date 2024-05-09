package com.fatimetou.patient.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Medicament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMed;

    @Column(nullable = false, unique = false)
    private String nom;
    @Column(nullable = false, unique = false)
    private String quantite;

    private String posologie;

    @ManyToOne
    @JoinColumn(name = "ordonnance_id")
    private Ordonnance ordonnance;
}
