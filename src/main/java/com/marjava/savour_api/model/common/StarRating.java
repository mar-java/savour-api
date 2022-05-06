package com.marjava.savour_api.model.common;

import javax.persistence.Embeddable;

@Embeddable
public class StarRating {
    private double stars = 0.;

    public double getStars() {
        return this.stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    // TODO: Not sure how to yet
    public void calculateStars() {

    }

}
