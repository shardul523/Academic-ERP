package org.esdpracticals.academicerp.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.esdpracticals.academicerp.dto.LoginRequest;
import org.esdpracticals.academicerp.dto.LoginResponse;
import org.esdpracticals.academicerp.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEntity<LoginResponse> loginEmployee(@RequestBody @Valid LoginRequest loginRequest) {
        LoginResponse res = employeeService.login(loginRequest);
        if (res.authenticated())
            return new ResponseEntity<>(res, HttpStatus.OK);
        return new ResponseEntity<>(res, HttpStatus.UNAUTHORIZED);
    }
}
