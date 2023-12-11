package com.makkaoui.comptemicroservice.repository;

import com.makkaoui.comptemicroservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long>{
}
