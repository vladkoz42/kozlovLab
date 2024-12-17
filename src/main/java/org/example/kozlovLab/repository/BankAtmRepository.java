package org.example.kozlovLab.repository;

import org.example.kozlovLab.entity.BankAtm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAtmRepository extends JpaRepository<BankAtm, Long> {
}
