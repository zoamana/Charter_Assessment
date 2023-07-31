package com.shipeen.assignment.util;

import com.shipeen.assignment.model.Customer;
import com.shipeen.assignment.model.RewardPointsResult;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Util {
    public List<RewardPointsResult> CalculateRewardPoints(Set<Customer> customers) {
        List<RewardPointsResult> result = new ArrayList<>();
        customers.forEach(
                customer -> {
                    result.add(CalculateRewardForCustomer(customer));
                }
        );
        return result;
    }

    private RewardPointsResult CalculateRewardForCustomer(Customer customer) {
        RewardPointsResult rewardPointsResult = new RewardPointsResult();
        rewardPointsResult.setCustomerId(customer.getId());
        Map<String, Integer> rewardsPerMonth = new HashMap<>();
        AtomicInteger total= new AtomicInteger();
        customer.getTransactions().forEach(
                trans->{
                    String month = trans.getCreateDate().getMonth().name();
                    int reward = amountToReward(trans.getAmount());
                    if (!rewardsPerMonth.containsKey(month)){
                        rewardsPerMonth.put(month,reward);
                    }else{
                        rewardsPerMonth.put(month,rewardsPerMonth.get(month)+reward);
                    }
                    total.addAndGet(reward);
                }
        );
        rewardPointsResult.setTotalRewardPoints(total.intValue());
        rewardPointsResult.setCustomerName(customer.getfName()+" "+customer.getlName());
        rewardPointsResult.setRewardPointsPerMonth(rewardsPerMonth);
        return rewardPointsResult;
    }

    private int amountToReward(Double rewardPoints){
        int reward=0;
        if (rewardPoints > 100){
            reward=(rewardPoints.intValue()-100)*2+50;
        }
        else if (rewardPoints > 50 && rewardPoints < 100) {
            reward = 50;
        }
        return reward;
    }
}

