package org.esdpracticals.academicerp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Specialisation_Course")
public class SpecialisationCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "specialisation_id")
    @ManyToOne
    Specialisation specialisation;

    @JoinColumn(name = "course_id")
    @ManyToOne
    Course course;
}
