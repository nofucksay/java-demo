package com.jyc.designpatterns._04_decorator.halocoffee.coffee.impl;

import com.jyc.designpatterns._04_decorator.halocoffee.coffee.Coffee;

/**
 * Created by ucar-jyc on 2017/9/30.
 */
public class Cappuccino extends Coffee {

    public Cappuccino() {
        this.description = "卡布奇诺";
    }

    @Override
    public double cost() {
        return 14.5;
    }
}
