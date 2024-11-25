package org.esdpracticals.academicerp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Faculty_Courses")
public class FacultyCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "faculty")
    @ManyToOne
    private Employee faculty;

    @JoinColumn(name = "course_id")
    @ManyToOne
    private Course course;
}
