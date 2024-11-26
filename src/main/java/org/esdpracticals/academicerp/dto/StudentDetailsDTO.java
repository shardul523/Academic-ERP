package org.esdpracticals.academicerp.dto;

import lombok.Builder;

@Builder
public record StudentDetailsDTO(
        String rollNumber,
        String firstName,
        String lastName,
        String email,
        String photographPath
) {
}
