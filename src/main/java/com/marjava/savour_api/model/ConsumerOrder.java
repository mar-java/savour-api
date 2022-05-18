package com.marjava.savour_api.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "consumer_order")
public class ConsumerOrder extends Order {
    @ManyToOne
    @JoinColumn(name = "consumer_id")
    private Consumer consumer;

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }
}
