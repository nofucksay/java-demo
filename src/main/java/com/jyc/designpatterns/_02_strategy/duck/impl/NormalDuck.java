package com.jyc.designpatterns._02_strategy.duck.impl;

import com.jyc.designpatterns._02_strategy.duck.Duck;
import com.jyc.designpatterns._02_strategy.duck.fly.impl.NormalFlyBehavior;
import com.jyc.designpatterns._02_strategy.duck.quack.impl.NormalQuackBehavior;

public class NormalDuck extends Duck {

	@Override
	public void display() {
		System.out.println("I am a normal duck !");
	}
	
	public NormalDuck() {
		quackBehavior = new NormalQuackBehavior();
		flyBehavior = new NormalFlyBehavior();
	}
}
