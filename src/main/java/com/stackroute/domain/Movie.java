package com.stackroute.domain;

import com.stackroute.domain.Actor;

public class Movie {

    private Actor shahrukh;

    public Actor getShahrukh() {
        return shahrukh;
    }

    public void setShahrukh(Actor shahrukh) {
        this.shahrukh = shahrukh;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "shahrukh=" + shahrukh +
                '}';
    }
}
