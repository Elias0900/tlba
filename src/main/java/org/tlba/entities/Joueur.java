package org.tlba.entities;

import jakarta.persistence.*;
import jdk.jfr.Percentage;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@Table(name = "JOUEUR")
public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

    @ManyToMany(mappedBy = "joueurs")
    private Set<Team> equipes = new HashSet<>();
}
