package com.jyc.designpatterns._01_strategy.duck;

import org.junit.Test;

import com.jyc.designpatterns._01_strategy.duck.fly.impl.RocketFlyBehavior;
import com.jyc.designpatterns._01_strategy.duck.impl.NormalDuck;
import com.jyc.designpatterns._01_strategy.duck.impl.RocketDuck;

public class DuckClient {

	@Test
	public void test(){
		// 测试普通鸭子
		Duck normalDuck = new NormalDuck();
		normalDuck.performFly();
		normalDuck.performQuack();
		
		// 测试火箭鸭子,动态设置行为
		Duck rocketDuck = new RocketDuck();
		rocketDuck.performFly();
		rocketDuck.performQuack();
		rocketDuck.setFlyBehavior(new RocketFlyBehavior());
		rocketDuck.performFly();
	}
	
	
}
