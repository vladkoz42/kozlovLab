package org.example.kozlovLab.service;

import org.example.kozlovLab.dto.PaymentAccountDto;
import org.example.kozlovLab.entity.PaymentAccount;


public interface PaymentAccountService {
    PaymentAccountDto createPaymentAccount(Long userId, Long bankId);

    PaymentAccount getPaymentAccountById(Long id);

    PaymentAccountDto getPaymentAccountByIdDto(Long id);

    PaymentAccountDto updatePaymentAccount(Long id, Integer amount);

    void deletePaymentAccount(Long id);
}
