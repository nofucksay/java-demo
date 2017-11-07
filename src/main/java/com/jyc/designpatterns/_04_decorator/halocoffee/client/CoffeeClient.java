package com.jyc.designpatterns._04_decorator.halocoffee.client;

import com.jyc.designpatterns._04_decorator.halocoffee.coffee.Coffee;
import com.jyc.designpatterns._04_decorator.halocoffee.coffee.impl.Cappuccino;
import com.jyc.designpatterns._04_decorator.halocoffee.decorator.impl.Coco;
import com.jyc.designpatterns._04_decorator.halocoffee.decorator.impl.Milk;
import com.jyc.designpatterns._04_decorator.halocoffee.decorator.impl.Sugar;
import org.junit.Test;

/**
 * Created by ucar-jyc on 2017/9/30.
 */
public class CoffeeClient {

    @Test
    public void test01() {

        // 普通卡布奇诺
        Coffee coffee = new Cappuccino();
        System.out.println(String.format("[%s]共花费%s元", coffee.getDescription(), coffee.cost()));

        // 加可可
        coffee = new Coco(coffee);
        System.out.println(String.format("[%s]共花费%s元", coffee.getDescription(), coffee.cost()));

        // 加牛奶
        coffee = new Milk(coffee);
        System.out.println(String.format("[%s]共花费%s元", coffee.getDescription(), coffee.cost()));

        // 加糖
        coffee = new Sugar(coffee);
        System.out.println(String.format("[%s]共花费%s元", coffee.getDescription(), coffee.cost()));
    }

}

