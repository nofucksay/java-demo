package com.jyc.designpatterns._04_decorator.halocoffee.coffee;

/**
 * Coffee的基类
 * Created by ucar-jyc on 2017/9/30.
 */
public abstract class Coffee {



    protected String description ; // 描述

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}


