package org.example.kozlovLab.service.mapper;

import javax.annotation.processing.Generated;
import org.example.kozlovLab.dto.UserDto;
import org.example.kozlovLab.entity.User;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-17T15:02:24+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setBankNames( mapBankNames( user.getBanks() ) );
        userDto.setCreditAccountsId( mapCreditAccountsId( user.getCreditAccounts() ) );
        userDto.setPaymentAccountsId( mapPaymentAccountsId( user.getPaymentAccounts() ) );
        userDto.setId( user.getId() );
        userDto.setFullName( user.getFullName() );
        userDto.setBirthDate( user.getBirthDate() );
        userDto.setWorkplace( user.getWorkplace() );
        userDto.setMonthlyIncome( user.getMonthlyIncome() );
        userDto.setCreditRating( user.getCreditRating() );

        return userDto;
    }
}
