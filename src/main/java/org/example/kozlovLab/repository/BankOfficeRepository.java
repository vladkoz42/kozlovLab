package org.example.kozlovLab.repository;

import org.example.kozlovLab.entity.BankOffice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankOfficeRepository extends JpaRepository<BankOffice, Long> {
}
