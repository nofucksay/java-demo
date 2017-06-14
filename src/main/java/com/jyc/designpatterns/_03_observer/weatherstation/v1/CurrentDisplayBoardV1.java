package com.jyc.designpatterns._03_observer.weatherstation.v1;

import com.jyc.designpatterns._03_observer.weatherstation.DisplayElement;

public class CurrentDisplayBoardV1 implements DisplayElement, Observer {

	// 温度
	private float temperature;
	
	// 湿度
	private float humidity;
	
	// 压力
	private float pressure;
	
	// 可观察者
	private Observable observable ;
	
	
	/**
	 * 构造函数,同时将观察者注册到可观察者中。
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 * @param observable
	 */
	public CurrentDisplayBoardV1(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.display();
	}

	@Override
	public void display() {
		System.out.println(this);

	}

	@Override
	public String toString() {
		return String.format("CurrentDisplayBoard:\t{temperature:%f,humidity:%f,pressure:%f}", temperature,humidity,pressure);
	}
	
}
