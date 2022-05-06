package com.marjava.savour_api.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.marjava.savour_api.model.common.StarRating;


@Entity
@Table(name = "producer")
public class Producer extends User {

    @Embedded
    @AttributeOverrides({@AttributeOverride(name="stars", column=@Column(name="rating"))})
    private StarRating rating = new StarRating();

    public void update(Producer prod) {
        this.setRating(prod.getRating());

        super.update(prod);
    }

    public StarRating getRating() {
        return rating;
    }

    public void setRating(StarRating rating) {
        this.rating = rating;
    }
}
