package com.jyc.designpatterns._05_factorymethod.pizzastore.store;

import com.jyc.designpatterns._05_factorymethod.pizzastore.pizza.Pizza;

/**
 * Created by jyc on 2017/10/13.
 */
public class NewYorkPizzaStore extends PizzaStore {
    
    protected Pizza createPizza() {

        Pizza pizza = new Pizza("NY-Style", "NY-Crust", "NY-Cheese", "NY-Size");

        System.out.println(String.format("%s create ok...", pizza.getStyle()));

        return pizza;
    }
}
