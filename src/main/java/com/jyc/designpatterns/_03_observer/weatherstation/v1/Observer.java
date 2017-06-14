package com.jyc.designpatterns._03_observer.weatherstation.v1;

public interface Observer {

	/**
	 * 观察者被通知时进行更新
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	void update(float temperature,float humidity,float pressure);
}
