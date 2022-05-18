package com.marjava.savour_api.model;

import com.marjava.savour_api.model.common.CostDistribution;
import com.marjava.savour_api.model.common.OrderStatus;

import javax.persistence.*;

@MappedSuperclass
public abstract class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int id;

    protected OrderStatus status;

    @Embedded
    protected CostDistribution costDistribution;

    public CostDistribution getCostDistribution() {
        return costDistribution;
    }

    public void setCostDistribution(CostDistribution costDistribution) {
        this.costDistribution = costDistribution;
    }
}