package org.example.kozlovLab.service.mapper;

import org.example.kozlovLab.dto.BankOfficeDto;
import org.example.kozlovLab.entity.BankOffice;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BankOfficeMapper {

    @Mapping(source = "bank.name", target = "bankName")
    BankOfficeDto toDto(BankOffice bankOffice);

}
