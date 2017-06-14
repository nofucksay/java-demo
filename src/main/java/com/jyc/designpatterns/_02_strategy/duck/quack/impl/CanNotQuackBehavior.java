package com.jyc.designpatterns._02_strategy.duck.quack.impl;

import com.jyc.designpatterns._02_strategy.duck.quack.QuackBehavior;

public class CanNotQuackBehavior implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("this duck can not quack !");
	}

}
