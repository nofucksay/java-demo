package com.jyc.designpatterns._04_decorator.halocoffee.coffee.impl;

import com.jyc.designpatterns._04_decorator.halocoffee.coffee.Coffee;

/**
 * 浓咖啡
 * Created by ucar-jyc on 2017/9/30.
 */
public class Espresso extends Coffee {

    public Espresso() {
        this.description = "浓咖啡";
    }

    @Override
    public double cost() {
        return 12.5;
    }
}
