package com.spring.security.demo.adminweb.data.repository;

import com.spring.security.demo.adminweb.data.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
