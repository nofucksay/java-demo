package com.jyc.designpatterns._03_observer.weatherstation.v1;

public interface Observable {

	/**
	 * 注册观察者
	 */
	void addObserver(Observer observer);
	
	/**
	 * 注销观察者
	 */
	void removeObserver(Observer observer);
	
	/**
	 * 通知观察者进行更新
	 */
	void notifyObservers();
}
