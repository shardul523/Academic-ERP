package org.esdpracticals.academicerp.mapper;

import org.esdpracticals.academicerp.dto.EmployeeDetailsResponse;
import org.esdpracticals.academicerp.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {
    public EmployeeDetailsResponse entityToResponse(Employee employee) {
        return EmployeeDetailsResponse.builder()
                .title(employee.getTitle())
                .email(employee.getEmail())
                .photographPath(employee.getPhotographPath())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .build();
    }
}
