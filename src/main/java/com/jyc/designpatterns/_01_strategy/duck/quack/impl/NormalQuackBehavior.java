package com.jyc.designpatterns._01_strategy.duck.quack.impl;

import com.jyc.designpatterns._01_strategy.duck.quack.QuackBehavior;

public class NormalQuackBehavior implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("this duck can quack !");
	}

}
