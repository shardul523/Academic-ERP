package org.esdpracticals.academicerp.mapper;

import org.esdpracticals.academicerp.dto.CourseDTO;
import org.esdpracticals.academicerp.entity.Course;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {
    public CourseDTO entityToDto(Course course) {
        return CourseDTO.builder()
                .courseCode(course.getCourseCode())
                .name(course.getName())
                .term(course.getTerm())
                .year(course.getYear())
                .faculty(course.getFaculty())
                .credits(course.getCredits())
                .capacity(course.getCapacity())
                .description(course.getDescription())
                .build();
    }
}
