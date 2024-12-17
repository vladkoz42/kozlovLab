package org.example.kozlovLab.repository;

import org.example.kozlovLab.entity.PaymentAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentAccountRepository extends JpaRepository<PaymentAccount, Long> {
}
