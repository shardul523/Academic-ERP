package org.esdpracticals.academicerp.dto;

import lombok.Builder;

@Builder
public record EmployeeDetailsResponse(
        String firstName,
        String lastName,
        String photographPath,
        String email,
        String title
) {
}
