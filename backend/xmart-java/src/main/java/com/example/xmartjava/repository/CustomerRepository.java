package com.example.xmartjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.xmartjava.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}
