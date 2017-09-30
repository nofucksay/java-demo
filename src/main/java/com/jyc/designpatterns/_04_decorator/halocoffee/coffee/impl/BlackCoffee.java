package com.jyc.designpatterns._04_decorator.halocoffee.coffee.impl;

import com.jyc.designpatterns._04_decorator.halocoffee.coffee.Coffee;

/**
 * Created by ucar-jyc on 2017/9/30.
 */
public class BlackCoffee extends Coffee {

    public BlackCoffee() {
        this.description = "黑咖啡";
    }

    @Override
    public double cost() {
        return 20.5;
    }
}
