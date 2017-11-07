package com.jyc.designpatterns._05_factorymethod.pizzastore.client;

import com.jyc.designpatterns._05_factorymethod.pizzastore.store.BeiJingPizzaStore;
import com.jyc.designpatterns._05_factorymethod.pizzastore.store.NewYorkPizzaStore;
import com.jyc.designpatterns._05_factorymethod.pizzastore.store.PizzaStore;

/**
 * Created by jyc on 2017/10/13.
 */
public class PizzaStoreClient {

    public static void main(String[] args) {

        PizzaStore pizzaStore1 = new BeiJingPizzaStore();
        pizzaStore1.orderPizza();

        PizzaStore pizzaStore2 = new NewYorkPizzaStore();
        pizzaStore2.orderPizza();


    }
}
