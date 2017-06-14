package com.jyc.designpatterns._02_observer.weatherstation.v2;

import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import com.jyc.designpatterns._02_observer.weatherstation.DisplayElement;

public class AvgDisplayBoardV2 implements DisplayElement, Observer {

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
	public AvgDisplayBoardV2(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println(this);

	}

	@Override
	public String toString() {
		return String.format("AvgDisplayBoard:\t{temperature:%f,humidity:%f,pressure:%f}", temperature,humidity,pressure);
	}

	/* 
	 * 当参数为null时,观察者根据可观察者暴露的方法PULL到数据做update
	 * 当参数不为null时,观察者根据可观察者PUSH的数据做update
	 * (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		if (arg == null) {
			if (o instanceof WeatherDataV2Pull) {
				WeatherDataV2Pull wd = (WeatherDataV2Pull) o ;
				this.totalTemperature += wd.getTemperature();
				this.totalHumidity += wd.getHumidity();
				this.totalPressure += wd.getPressure();
				
				dataCount++;
				
				this.temperature = totalTemperature / dataCount;
				this.humidity = totalHumidity / dataCount;
				this.pressure = totalPressure / dataCount;
				this.display();
			}
		}else{
			if (arg instanceof Map) {
				Map<String,Float> args = (Map<String,Float>) arg;
				this.totalTemperature += args.get("temperature");
				this.totalHumidity += args.get("humidity");
				this.totalPressure += args.get("pressure");
				
				dataCount++;
				
				this.temperature = totalTemperature / dataCount;
				this.humidity = totalHumidity / dataCount;
				this.pressure = totalPressure / dataCount;
				this.display();
			}
		}
		
	}
	
}
