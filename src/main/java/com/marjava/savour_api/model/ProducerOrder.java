package com.marjava.savour_api.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "producer_order")
public class ProducerOrder extends Order {
    @ManyToOne
    @JoinColumn(name = "producer_id")
    private Producer producer;

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }
}
