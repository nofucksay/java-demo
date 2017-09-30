package com.jyc.designpatterns._04_decorator.halocoffee.decorator.impl;

import com.jyc.designpatterns._04_decorator.halocoffee.coffee.Coffee;
import com.jyc.designpatterns._04_decorator.halocoffee.decorator.CoffeeDecorator;

/**
 * Created by ucar-jyc on 2017/9/30.
 */
public class Milk extends CoffeeDecorator {

    public Milk(Coffee coffee) {
        super(coffee);
        this.description = "牛奶+" + coffee.getDescription() ;
    }

    @Override
    public double cost() {
        return 1 + coffee.cost();
    }
}
