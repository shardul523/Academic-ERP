package org.esdpracticals.academicerp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Specialisation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "specialisation_id")
    private Long specialisationId;

    @Column(name = "code", unique = true, nullable = false)
    private String code;

    private String name;
    private String description;

    @Column(name = "\"year\"")
    private Integer year;

    @Column(name = "credits_required")
    private Integer creditsRequired;

    @OneToMany(mappedBy = "specialisation")
    private Set<Student> students = new HashSet<>();
}
