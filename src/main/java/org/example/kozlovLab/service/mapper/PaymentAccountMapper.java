package org.example.kozlovLab.service.mapper;

import org.example.kozlovLab.dto.PaymentAccountDto;
import org.example.kozlovLab.entity.PaymentAccount;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PaymentAccountMapper {

    @Mapping(source = "bank.id", target = "bankId")
    @Mapping(source = "user.id", target = "userId")
    PaymentAccountDto toDto(PaymentAccount paymentAccount);

}
