package com.jyc.designpatterns._03_observer.weatherstation.v2;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/**
 * 接收观测数据并通知观察者的 被观察者
 * 
 * @author 贾玉晨
 * @date 2017年6月14日-上午10:36:06
 */
public class WeatherDataV2Push extends Observable {

	// 温度
	private float temperature;

	// 湿度
	private float humidity;

	// 压力
	private float pressure;

	/**
	 * 设置观测数据的方法
	 * 
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		Map<String,Float> args = new HashMap<String,Float>();
		args.put("temperature", temperature);
		args.put("humidity", humidity);
		args.put("pressure", pressure);
		
		measurementsChanged(args);
	};

	/**
	 * 当观测数据被重新设置后,需要通知观察者进行数据更新
	 */
	public void measurementsChanged(Object args) {
		setChanged();// 改变Observable中的changed标记
		notifyObservers(args);
	}

}
