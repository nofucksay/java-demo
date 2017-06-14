package com.jyc.designpatterns._02_observer.weatherstation.v2;

import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import com.jyc.designpatterns._02_observer.weatherstation.DisplayElement;

public class CurrentDisplayBoardV2 implements DisplayElement, Observer {

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
	public CurrentDisplayBoardV2(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println(this);

	}

	@Override
	public String toString() {
		return String.format("CurrentDisplayBoard:\t{temperature:%f,humidity:%f,pressure:%f}", temperature,humidity,pressure);
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
				this.temperature = wd.getTemperature();
				this.humidity = wd.getHumidity();
				this.pressure = wd.getPressure();
				this.display();
			}
		}else{
			if (arg instanceof Map) {
				Map<String,Float> args = (Map<String,Float>) arg;
				this.temperature = args.get("temperature");
				this.humidity = args.get("humidity");
				this.pressure = args.get("pressure");
				this.display();
			}
		}
		
	}
	
}
