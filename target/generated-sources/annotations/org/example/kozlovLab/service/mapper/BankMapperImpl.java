package org.example.kozlovLab.service.mapper;

import javax.annotation.processing.Generated;
import org.example.kozlovLab.dto.BankDto;
import org.example.kozlovLab.entity.Bank;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-17T15:02:23+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class BankMapperImpl implements BankMapper {

    @Override
    public BankDto toDto(Bank bank) {
        if ( bank == null ) {
            return null;
        }

        BankDto bankDto = new BankDto();

        bankDto.setId( bank.getId() );
        bankDto.setName( bank.getName() );
        bankDto.setCountOffices( bank.getCountOffices() );
        bankDto.setCountAtms( bank.getCountAtms() );
        bankDto.setCountEmployees( bank.getCountEmployees() );
        bankDto.setCountClients( bank.getCountClients() );
        bankDto.setRating( bank.getRating() );
        bankDto.setTotalMoney( bank.getTotalMoney() );
        bankDto.setInterestRate( bank.getInterestRate() );

        return bankDto;
    }
}
