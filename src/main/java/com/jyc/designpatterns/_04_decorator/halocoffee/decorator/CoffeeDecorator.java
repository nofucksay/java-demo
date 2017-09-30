package com.jyc.designpatterns._04_decorator.halocoffee.decorator;

import com.jyc.designpatterns._04_decorator.halocoffee.coffee.Coffee;

/**
 * Created by ucar-jyc on 2017/9/30.
 */
public class CoffeeDecorator extends Coffee {

    protected Coffee coffee ; // 被装饰对象

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost();
    }
}
