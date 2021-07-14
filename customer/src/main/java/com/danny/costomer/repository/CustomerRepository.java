package com.danny.costomer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.danny.costomer.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer> {

}
