package com.makkaoui.comptemicroservice.mappers;

import com.makkaoui.comptemicroservice.dto.BankAccountResponseDto;
import com.makkaoui.comptemicroservice.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {




    public BankAccountResponseDto convertToDto(BankAccount bankAccount){
        BankAccountResponseDto bankAccountResponseDto =  new BankAccountResponseDto();
        BeanUtils.copyProperties(bankAccount,bankAccountResponseDto);
        return bankAccountResponseDto;
    }
}
