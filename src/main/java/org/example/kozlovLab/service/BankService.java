package org.example.kozlovLab.service;

import org.example.kozlovLab.dto.BankDto;
import org.example.kozlovLab.entity.Bank;

public interface BankService {

    BankDto createBank(String bankName);

    Bank getBankById(Long id);

    BankDto getBankByIdDto(Long id);

    BankDto updateBank(Long id, String name);

    void deleteBank(Long id);
}
