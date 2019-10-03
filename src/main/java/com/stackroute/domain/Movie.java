package com.stackroute.domain;

import com.stackroute.domain.Actor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    private Actor shahrukh;
    private Actor amir;
    private Actor salman;
    BeanFactory beanFactory;
    String s;
    ApplicationContext applicationContext;
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

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

        this.beanFactory=beanFactory;
        System.out.println("beanFactory is set");
    }

    @Override
    public void setBeanName(String s) {
     this.s=s;
        System.out.println("bean name is set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
     this.applicationContext=applicationContext;
        System.out.println("Apllication context is set");
    }
}
