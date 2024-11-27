package org.esdpracticals.academicerp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record CourseDTO(
        @NotNull
        @NotBlank
        String courseCode,
        String name,
        String description,
        Integer year,
        String term,
        String faculty,
        Integer credits,
        Integer capacity
) {
}
