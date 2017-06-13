package com.jyc.designpatterns._01_strategy.duck.fly.impl;

import com.jyc.designpatterns._01_strategy.duck.fly.FlyBehavior;

public class CanNotFlyBehavior implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("this duck can not fly !");
	}

}
