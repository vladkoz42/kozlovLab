package org.example.kozlovLab.service.mapper;

import org.example.kozlovLab.dto.EmployeeDto;
import org.example.kozlovLab.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    @Mapping(source = "bank.name", target = "bankName")
    @Mapping(source = "office.name", target = "officeName")
    EmployeeDto toDto(Employee employee);

}
