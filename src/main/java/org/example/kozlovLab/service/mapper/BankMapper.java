package org.example.kozlovLab.service.mapper;

import org.example.kozlovLab.dto.BankDto;
import org.example.kozlovLab.entity.Bank;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BankMapper {

    BankDto toDto(Bank bank);

}
