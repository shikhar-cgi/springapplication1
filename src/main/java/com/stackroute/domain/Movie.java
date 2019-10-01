package com.stackroute.domain;

import com.stackroute.domain.Actor;

public class Movie {

    private Actor shahrukh;
    private Actor amir;
    private Actor salman;

    public Movie(Actor shahrukh, Actor amir, Actor salman) {
        this.shahrukh = shahrukh;
        this.amir = amir;
        this.salman = salman;
    }

    public Actor getShahrukh() {
        return shahrukh;
    }

    public void setShahrukh(Actor shahrukh) {
        this.shahrukh = shahrukh;
    }

    public Actor getAmir() {
        return amir;
    }

    public void setAmir(Actor amir) {
        this.amir = amir;
    }

    public Actor getSalman() {
        return salman;
    }

    public void setSalman(Actor salman) {
        this.salman = salman;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "shahrukh=" + shahrukh +
                ", amir=" + amir +
                ", salman=" + salman +
                '}';
    }
}
