package org.esdpracticals.academicerp.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.esdpracticals.academicerp.entity.CourseSchedule;
import org.esdpracticals.academicerp.mapper.CourseMapper;
import org.esdpracticals.academicerp.mapper.CourseScheduleMapper;

@Data
public class FacultyCourseScheduleResponse {
    private CourseScheduleDTO courseSchedule;
    private String specialisation;
    @JsonIgnore
    private CourseScheduleMapper courseScheduleMapper = new CourseScheduleMapper(new CourseMapper());

    FacultyCourseScheduleResponse(CourseSchedule courseSchedule, String specialisation) {
        this.courseSchedule = courseScheduleMapper.entityToDto(courseSchedule);
        this.specialisation = specialisation;
    }
}
