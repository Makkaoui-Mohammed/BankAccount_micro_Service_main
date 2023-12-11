package com.makkaoui.comptemicroservice.service;

import com.makkaoui.comptemicroservice.dto.BankAccountRequestDto;
import com.makkaoui.comptemicroservice.dto.BankAccountResponseDto;


public interface AccountService {

    BankAccountResponseDto addAccount(BankAccountRequestDto bankAccountDto);
    BankAccountResponseDto updateAccount(String id,BankAccountRequestDto bankAccountDto);
    boolean deleteAccount(String id);
}

