package com.makkaoui.comptemicroservice;

import com.makkaoui.comptemicroservice.entities.BankAccount;
import com.makkaoui.comptemicroservice.entities.Customer;
import com.makkaoui.comptemicroservice.enums.AccountType;
import com.makkaoui.comptemicroservice.repository.BankAccountRepository;
import com.makkaoui.comptemicroservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class CompteMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompteMicroServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BankAccountRepository bankAccountRepository, CustomerRepository customerRepository){
        return args -> {

            Stream.of("Charaf","Salwa","Saad","Laila","Kawtar").forEach(c->{
                Customer customer = Customer.builder()

                        .name(c)
                        .build();
                customerRepository.save(customer);
            });
            customerRepository.findAll().forEach(customer -> {
                for (int i = 0; i <10 ; i++) {
                    BankAccount bankAccount = BankAccount.builder()
                            .id(UUID.randomUUID().toString())
                            .balance(1000 +Math.random()*9000)
                            .currency("MAD")
                            .createdAt(new Date())
                            .type(Math.random()>0.5 ? AccountType.SAVING_ACCOUNT : AccountType.CURRENT_ACCOUNT)
                            .customer(customer)
                            .build();


                    bankAccountRepository.save(bankAccount);
                }
            });

        };
    }
}

