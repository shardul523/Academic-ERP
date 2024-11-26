package org.esdpracticals.academicerp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    Long studentId;

    @Column(name = "roll_number", nullable = false, unique = true)
    String rollNumber;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "email", unique = true, nullable = false)
    String email;

    @Column(name = "photograph_path")
    String photographPath;

    @Column(name = "cgpa")
    Double cgpa;

    @Column(name = "total_credits")
    Integer totalCredits;

    @Column(name = "\"year\"")
    Integer year;

    @JoinColumn(name = "specialisation")
    @ManyToOne
    Specialisation specialisation;
}
