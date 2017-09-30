package com.jyc.designpatterns._04_decorator.halocoffee.decorator.impl;

import com.jyc.designpatterns._04_decorator.halocoffee.coffee.Coffee;
import com.jyc.designpatterns._04_decorator.halocoffee.decorator.CoffeeDecorator;

/**
 * Created by ucar-jyc on 2017/9/30.
 */
public class Coco extends CoffeeDecorator {

    public Coco(Coffee coffee) {
        super(coffee);
        this.description = "可可+" + coffee.getDescription() ;
    }

    @Override
    public double cost() {
        return 3 + coffee.cost();
    }
}
