package org.esdpracticals.academicerp.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.esdpracticals.academicerp.dto.CourseDTO;
import org.esdpracticals.academicerp.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping("/courses")
    public ResponseEntity<List<CourseDTO>> getEmployeeCourses(HttpServletRequest request) {
        return ResponseEntity.ok(employeeService.getEmployeeCourses(request));
    }
}
