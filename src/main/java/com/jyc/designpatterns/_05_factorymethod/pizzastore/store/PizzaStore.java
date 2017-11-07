package com.jyc.designpatterns._05_factorymethod.pizzastore.store;

import com.jyc.designpatterns._05_factorymethod.pizzastore.pizza.Pizza;

/**
 * Created by jyc on 2017/10/13.
 */
public abstract class PizzaStore {
    
    public void orderPizza(){
        
        Pizza pizza = createPizza();

        System.out.println(String.format("%s crust ok...",pizza.getStyle()));

        System.out.println(String.format("%s cheese ok...",pizza.getStyle()));

        System.out.println(String.format("%s ok...",pizza.getStyle()));


    }

    /**
     * factory method
     * @return
     */
    protected abstract Pizza createPizza();
}
