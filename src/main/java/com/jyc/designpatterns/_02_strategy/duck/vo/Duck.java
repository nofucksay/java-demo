package com.jyc.designpatterns._02_strategy.duck.vo;

import com.jyc.designpatterns._02_strategy.duck.fly.FlyBehavior;
import com.jyc.designpatterns._02_strategy.duck.quack.QuackBehavior;

/**
 * 鸭子抽象类,此时只有会叫的和外表不同的鸭子。
 * @author 贾玉晨
 * @date 2017年6月12日-下午4:38:36	 
 */
public abstract class Duck {
	
	protected FlyBehavior flyBehavior ;
	
	protected QuackBehavior quackBehavior;
	
	/**
	 * 呱呱叫
	 */
	public void performQuack(){
		quackBehavior.quack();
	}
	
	/**
	 * 外表
	 */
	public abstract void display();
	
	/**
	 * 飞行
	 */
	public void performFly(){
		flyBehavior.fly();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	
}
