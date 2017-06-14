package com.jyc.designpatterns._02_observer.weatherstation.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 接收观测数据并通知观察者的 被观察者
 * @author 贾玉晨
 * @date 2017年6月14日-上午10:36:06	 
 */
public class WeatherDataV1 implements Observable {

	// 温度
	private float temperature;
	
	// 湿度
	private float humidity;
	
	// 压力
	private float pressure;	
	
	// 观察者List
	private List<Observer> observers = new ArrayList<Observer>();
	
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}

	}

	/**
	 * 设置观测数据的方法
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	};
	
	/**
	 * 当观测数据被重新设置后,需要通知观察者进行数据更新
	 */
	public void measurementsChanged(){
		notifyObservers();
	}

}
