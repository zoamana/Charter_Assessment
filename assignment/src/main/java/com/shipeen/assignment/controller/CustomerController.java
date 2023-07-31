package com.shipeen.assignment.controller;

import com.shipeen.assignment.model.Customer;
import com.shipeen.assignment.model.RewardPointsResult;
import com.shipeen.assignment.repository.CustomerRepository;
import com.shipeen.assignment.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/reward/points")
    public ResponseEntity<List<RewardPointsResult>> getRewardPointsOfCustomer() {
        List<RewardPointsResult> rewardPointsResult;
        try {
            Set<Customer> customers = customerRepository.findAllByCreateDateBetween();
            rewardPointsResult = new Util().CalculateRewardPoints(customers);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(rewardPointsResult, HttpStatus.OK);
    }
}