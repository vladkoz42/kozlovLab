package org.example.kozlovLab.service;

import org.example.kozlovLab.dto.EmployeeDto;
import org.example.kozlovLab.entity.Employee;

import java.time.LocalDate;

public interface EmployeeService {
    EmployeeDto createEmployee(String fullName, LocalDate birthDate, String position, Long bankId,
                               Boolean isRemote, Long bankOfficeId, Boolean canIssueLoans, Integer salary);

    Employee getEmployeeById(Long id);

    EmployeeDto getEmployeeByIdDto(Long id);

    EmployeeDto updateEmployee(Long id, String fullName, String position, Long bankId,
                            Boolean isRemote, Long bankOfficeId, Boolean canIssueLoans, Integer salary);

    void deleteEmployee(Long id);
}
