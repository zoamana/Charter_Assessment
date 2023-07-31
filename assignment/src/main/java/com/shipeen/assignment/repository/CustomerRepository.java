package com.shipeen.assignment.repository;

import com.shipeen.assignment.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    @Query(value = "SELECT a.*,b.* FROM customer a inner join transaction b on a.id = b.customer_id WHERE b.create_date between '2023-05-26' and '2023-07-27' ",nativeQuery = true)
    Set<Customer> findAllByCreateDateBetween();
}
