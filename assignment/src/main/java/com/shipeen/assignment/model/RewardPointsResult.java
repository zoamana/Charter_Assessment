package com.shipeen.assignment.model;

import java.util.Map;

public class RewardPointsResult {

    private String customerName;
    private Long customerId;
    private Map<String, Integer> rewardPointsPerMonth;
    private Integer totalRewardPoints;

    public RewardPointsResult() {
    }
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Map<String, Integer> getRewardPointsPerMonth() {
        return rewardPointsPerMonth;
    }

    public void setRewardPointsPerMonth(Map<String, Integer> rewardPointsPerMonth) {
        this.rewardPointsPerMonth = rewardPointsPerMonth;
    }

    public Integer getTotalRewardPoints() {
        return totalRewardPoints;
    }

    public void setTotalRewardPoints(Integer totalRewardPoints) {
        this.totalRewardPoints = totalRewardPoints;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getCustomerId() {
        return customerId;
    }
}
