package com.marjava.savour_api.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "producer")
public class Producer extends User {
    public void update(Producer prod) {
        super.update(prod);
    }
}
