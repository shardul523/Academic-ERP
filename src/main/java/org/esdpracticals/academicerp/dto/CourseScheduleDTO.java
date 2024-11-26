package org.esdpracticals.academicerp.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.util.Date;

@Builder
public record CourseScheduleDTO(
        @NotNull
        CourseDTO course,
        String time,
        String day,
        String room,
        String building
) {
}
