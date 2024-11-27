package org.esdpracticals.academicerp.mapper;

import lombok.RequiredArgsConstructor;
import org.esdpracticals.academicerp.dto.CourseScheduleDTO;
import org.esdpracticals.academicerp.entity.CourseSchedule;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CourseScheduleMapper {
    private final CourseMapper courseMapper;

    public CourseScheduleDTO entityToDto(CourseSchedule courseSchedule) {
        return CourseScheduleDTO.builder()
                .day(courseSchedule.getDay())
                .course(courseMapper.entityToDto(courseSchedule.getCourse()))
                .room(courseSchedule.getRoom())
                .time(courseSchedule.getTime())
                .building(courseSchedule.getBuilding())
                .build();
    }
}
