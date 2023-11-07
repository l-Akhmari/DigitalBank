package com.lAkhmari.bankaccountservice.repositories;

import com.lAkhmari.bankaccountservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
