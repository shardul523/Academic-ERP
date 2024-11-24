package org.esdpracticals.academicerp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Course_Schedule")
public class CourseSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "course_id")
    @ManyToOne
    private Course course;

    private Date time;

    @Column(name = "`day`")
    private String day;
    private String room;
    private String building;
}
