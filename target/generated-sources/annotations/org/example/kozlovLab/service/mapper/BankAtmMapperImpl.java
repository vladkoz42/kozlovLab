package org.example.kozlovLab.service.mapper;

import javax.annotation.processing.Generated;
import org.example.kozlovLab.dto.BankAtmDto;
import org.example.kozlovLab.entity.Bank;
import org.example.kozlovLab.entity.BankAtm;
import org.example.kozlovLab.entity.BankOffice;
import org.example.kozlovLab.entity.Employee;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-17T15:02:24+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class BankAtmMapperImpl implements BankAtmMapper {

    @Override
    public BankAtmDto toDto(BankAtm bankAtm) {
        if ( bankAtm == null ) {
            return null;
        }

        BankAtmDto bankAtmDto = new BankAtmDto();

        bankAtmDto.setLocationAddress( bankAtmLocationAddress( bankAtm ) );
        bankAtmDto.setServicingEmployeeName( bankAtmServicingEmployeeFullName( bankAtm ) );
        bankAtmDto.setBankName( bankAtmBankName( bankAtm ) );
        bankAtmDto.setId( bankAtm.getId() );
        bankAtmDto.setName( bankAtm.getName() );
        bankAtmDto.setAddress( bankAtm.getAddress() );
        bankAtmDto.setStatus( bankAtm.getStatus() );
        bankAtmDto.setIsIssuingMoney( bankAtm.getIsIssuingMoney() );
        bankAtmDto.setIsDepositingMoney( bankAtm.getIsDepositingMoney() );
        bankAtmDto.setAmountOfMoney( bankAtm.getAmountOfMoney() );
        bankAtmDto.setServicingCost( bankAtm.getServicingCost() );

        return bankAtmDto;
    }

    private String bankAtmLocationAddress(BankAtm bankAtm) {
        if ( bankAtm == null ) {
            return null;
        }
        BankOffice location = bankAtm.getLocation();
        if ( location == null ) {
            return null;
        }
        String address = location.getAddress();
        if ( address == null ) {
            return null;
        }
        return address;
    }

    private String bankAtmServicingEmployeeFullName(BankAtm bankAtm) {
        if ( bankAtm == null ) {
            return null;
        }
        Employee servicingEmployee = bankAtm.getServicingEmployee();
        if ( servicingEmployee == null ) {
            return null;
        }
        String fullName = servicingEmployee.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private String bankAtmBankName(BankAtm bankAtm) {
        if ( bankAtm == null ) {
            return null;
        }
        Bank bank = bankAtm.getBank();
        if ( bank == null ) {
            return null;
        }
        String name = bank.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
