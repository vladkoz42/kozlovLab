package org.example.kozlovLab.service.mapper;

import javax.annotation.processing.Generated;
import org.example.kozlovLab.dto.CreditAccountDto;
import org.example.kozlovLab.entity.Bank;
import org.example.kozlovLab.entity.CreditAccount;
import org.example.kozlovLab.entity.Employee;
import org.example.kozlovLab.entity.PaymentAccount;
import org.example.kozlovLab.entity.User;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-17T15:02:24+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class CreditAccountMapperImpl implements CreditAccountMapper {

    @Override
    public CreditAccountDto toDto(CreditAccount creditAccount) {
        if ( creditAccount == null ) {
            return null;
        }

        CreditAccountDto creditAccountDto = new CreditAccountDto();

        creditAccountDto.setUserName( creditAccountUserFullName( creditAccount ) );
        creditAccountDto.setBankName( creditAccountBankName( creditAccount ) );
        creditAccountDto.setIssuingEmployeeName( creditAccountIssuingEmployeeFullName( creditAccount ) );
        creditAccountDto.setPaymentAccountAmount( creditAccountPaymentAccountAmount( creditAccount ) );
        creditAccountDto.setId( creditAccount.getId() );
        creditAccountDto.setStartDate( creditAccount.getStartDate() );
        creditAccountDto.setEndDate( creditAccount.getEndDate() );
        creditAccountDto.setNumberOfMonths( creditAccount.getNumberOfMonths() );
        creditAccountDto.setLoanAmount( creditAccount.getLoanAmount() );
        creditAccountDto.setMonthlyPayment( creditAccount.getMonthlyPayment() );
        creditAccountDto.setInterestRate( creditAccount.getInterestRate() );

        return creditAccountDto;
    }

    private String creditAccountUserFullName(CreditAccount creditAccount) {
        if ( creditAccount == null ) {
            return null;
        }
        User user = creditAccount.getUser();
        if ( user == null ) {
            return null;
        }
        String fullName = user.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private String creditAccountBankName(CreditAccount creditAccount) {
        if ( creditAccount == null ) {
            return null;
        }
        Bank bank = creditAccount.getBank();
        if ( bank == null ) {
            return null;
        }
        String name = bank.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String creditAccountIssuingEmployeeFullName(CreditAccount creditAccount) {
        if ( creditAccount == null ) {
            return null;
        }
        Employee issuingEmployee = creditAccount.getIssuingEmployee();
        if ( issuingEmployee == null ) {
            return null;
        }
        String fullName = issuingEmployee.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private Integer creditAccountPaymentAccountAmount(CreditAccount creditAccount) {
        if ( creditAccount == null ) {
            return null;
        }
        PaymentAccount paymentAccount = creditAccount.getPaymentAccount();
        if ( paymentAccount == null ) {
            return null;
        }
        Integer amount = paymentAccount.getAmount();
        if ( amount == null ) {
            return null;
        }
        return amount;
    }
}
