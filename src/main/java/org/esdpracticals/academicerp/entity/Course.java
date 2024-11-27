package org.esdpracticals.academicerp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    Long courseId;

    @Column(name = "course_code", nullable = false, unique = true)
    String courseCode;

    String name;
    String description;

    @Column(name = "\"year\"")
    Integer year;

    String term;
    String faculty;
    Integer credits;
    Integer capacity;
}
