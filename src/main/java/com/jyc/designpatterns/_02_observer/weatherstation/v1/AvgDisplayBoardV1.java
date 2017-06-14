package com.jyc.designpatterns._02_observer.weatherstation.v1;

import com.jyc.designpatterns._02_observer.weatherstation.DisplayElement;

public class AvgDisplayBoardV1 implements DisplayElement, Observer {

	// 温度
	private float temperature;
	
	// 湿度
	private float humidity;
	
	// 压力
	private float pressure;
	
	// 总温度
	private float totalTemperature;
	
	// 总湿度
	private float totalHumidity;
	
	// 总压力
	private float totalPressure;
	
	// 可观察者
	private Observable observable ;
	
	// 数据改变次数
	private int dataCount;
	
	
	/**
	 * 构造函数,同时将观察者注册到可观察者中。
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 * @param observable
	 */
	public AvgDisplayBoardV1(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		dataCount++;
		this.totalTemperature += temperature;
		this.totalHumidity += humidity;
		this.totalPressure += pressure;
		this.temperature = totalTemperature / dataCount;
		this.humidity = totalHumidity / dataCount;
		this.pressure = totalPressure / dataCount;
		this.display();
	}

	@Override
	public void display() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return String.format("AvgDisplayBoard:{temperature:%f,humidity:%f,pressure:%f}", temperature,humidity,pressure);
	}
	
}
