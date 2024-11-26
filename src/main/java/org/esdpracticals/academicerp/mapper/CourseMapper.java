package org.esdpracticals.academicerp.mapper;

import org.esdpracticals.academicerp.dto.CourseDTO;
import org.esdpracticals.academicerp.entity.Course;
import org.springframework.stereotype.Component;

@Component
public class CourseMapper {
    public CourseDTO entityToDto(Course course) {
        return CourseDTO.builder()
                .courseCode(course.getCourseCode())
                .name(course.getName())
                .term(course.getTerm())
                .year(course.getYear())
                .faculty(course.getFaculty())
                .credits(course.getCredits())
                .description(course.getDescription())
                .capacity(course.getCapacity())
                .build();
    }
}
