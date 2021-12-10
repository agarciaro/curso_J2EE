package com.cursojavaee.restjavaee.service;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

@Singleton
public class ContadorImpl implements Contador{

    private int counter;

    @PostConstruct
    void init(){
        counter = 0;
    }

    @Override
    public int getCount() {
        return counter++;
    }
}
