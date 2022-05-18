package com.marjava.savour_api.model.common;

import javax.persistence.Embeddable;

@Embeddable
public class CostDistribution {
    private double deliveryCost;

    private double totalCost;

    public double getOverallCost() {
        return this.deliveryCost + this.totalCost;
    }

    public void setDeliveryCost(double deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
