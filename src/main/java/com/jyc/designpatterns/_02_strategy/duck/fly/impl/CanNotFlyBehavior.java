package com.jyc.designpatterns._02_strategy.duck.fly.impl;

import com.jyc.designpatterns._02_strategy.duck.fly.FlyBehavior;

public class CanNotFlyBehavior implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("this duck can not fly !");
	}

}
