package com.jyc.designpatterns._04_decorator.halocoffee.decorator.impl;

import com.jyc.designpatterns._04_decorator.halocoffee.coffee.Coffee;
import com.jyc.designpatterns._04_decorator.halocoffee.decorator.CoffeeDecorator;

/**
 * Created by ucar-jyc on 2017/9/30.
 */
public class Sugar extends CoffeeDecorator {

    public Sugar(Coffee coffee) {
        super(coffee);
        this.description = "糖+" + coffee.getDescription() ;
    }

    @Override
    public double cost() {
        return 2 + coffee.cost();
    }
}
