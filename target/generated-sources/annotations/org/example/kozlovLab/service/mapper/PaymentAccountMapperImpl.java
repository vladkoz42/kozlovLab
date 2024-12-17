package org.example.kozlovLab.service.mapper;

import javax.annotation.processing.Generated;
import org.example.kozlovLab.dto.PaymentAccountDto;
import org.example.kozlovLab.entity.Bank;
import org.example.kozlovLab.entity.PaymentAccount;
import org.example.kozlovLab.entity.User;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-17T15:02:24+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class PaymentAccountMapperImpl implements PaymentAccountMapper {

    @Override
    public PaymentAccountDto toDto(PaymentAccount paymentAccount) {
        if ( paymentAccount == null ) {
            return null;
        }

        PaymentAccountDto paymentAccountDto = new PaymentAccountDto();

        paymentAccountDto.setBankId( paymentAccountBankId( paymentAccount ) );
        paymentAccountDto.setUserId( paymentAccountUserId( paymentAccount ) );
        paymentAccountDto.setId( paymentAccount.getId() );
        paymentAccountDto.setAmount( paymentAccount.getAmount() );

        return paymentAccountDto;
    }

    private Long paymentAccountBankId(PaymentAccount paymentAccount) {
        if ( paymentAccount == null ) {
            return null;
        }
        Bank bank = paymentAccount.getBank();
        if ( bank == null ) {
            return null;
        }
        Long id = bank.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long paymentAccountUserId(PaymentAccount paymentAccount) {
        if ( paymentAccount == null ) {
            return null;
        }
        User user = paymentAccount.getUser();
        if ( user == null ) {
            return null;
        }
        Long id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
