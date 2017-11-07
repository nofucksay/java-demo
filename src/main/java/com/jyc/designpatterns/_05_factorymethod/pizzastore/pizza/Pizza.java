package com.jyc.designpatterns._05_factorymethod.pizzastore.pizza;

/**
 * Created by jyc on 2017/10/13.
 */
public class Pizza {

    private String style ; // pizza's style

    private String crust ; // pizza's crust

    private String cheese ; // pizza's cheese

    private String size ; // pizza's size


    public Pizza(String style, String crust, String cheese, String size) {
        this.style = style;
        this.crust = crust;
        this.cheese = cheese;
        this.size = size;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
