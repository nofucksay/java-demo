package com.jyc.designpatterns._02_observer.weatherstation;

import org.junit.Test;

import com.jyc.designpatterns._02_observer.weatherstation.v1.AvgDisplayBoardV1;
import com.jyc.designpatterns._02_observer.weatherstation.v1.CurrentDisplayBoardV1;
import com.jyc.designpatterns._02_observer.weatherstation.v1.WeatherDataV1;
import com.jyc.designpatterns._02_observer.weatherstation.v2.AvgDisplayBoardV2;
import com.jyc.designpatterns._02_observer.weatherstation.v2.CurrentDisplayBoardV2;
import com.jyc.designpatterns._02_observer.weatherstation.v2.WeatherDataV2Pull;
import com.jyc.designpatterns._02_observer.weatherstation.v2.WeatherDataV2Push;

public class WeatherStationClient {

	/**
	 * v1版本使用自定义的实现方式实现观察者模式
	 */
	@Test
	public void testV1() {
		// 创建 可观察者 对象
		WeatherDataV1 wd = new WeatherDataV1();

		// 创建 当前情况显示板 对象
		CurrentDisplayBoardV1 cdb = new CurrentDisplayBoardV1(wd);
		cdb.display();

		// 创建 平均情况显示板 对象
		AvgDisplayBoardV1 adb = new AvgDisplayBoardV1(wd);
		adb.display();

		// 改变观测数据
		wd.setMeasurements(80, 90, 100);
		wd.setMeasurements(81, 91, 101.3f);
		wd.setMeasurements(82, 92, 102.1f);
	}

	/**
	 * v2版本使用jdk自带的 Observable类和Observer接口实现 此方法测试使用push方式实现观察者的数据更新
	 * push方式中,可观察者不对外提供获取数据的方法,而是将数据包装成参数推送给观察者们处理
	 */
	@Test
	public void testV2Push() {
		// 创建 可观察者 对象
		WeatherDataV2Push wd = new WeatherDataV2Push();

		// 创建 当前情况显示板 对象
		CurrentDisplayBoardV2 cdb = new CurrentDisplayBoardV2(wd);
		cdb.display();

		// 创建 平均情况显示板 对象
		AvgDisplayBoardV2 adb = new AvgDisplayBoardV2(wd);
		adb.display();

		// 改变观测数据
		wd.setMeasurements(80, 90, 100);
		wd.setMeasurements(81, 91, 101.3f);
		wd.setMeasurements(82, 92, 102.1f);
	}
	
	/**
	 * v2版本使用jdk自带的 Observable类和Observer接口实现 此方法测试使用pull方式实现观察者的数据更新
	 * pull方式中,可观察者对外提供获取各项数据的方法,由观察者自由决定获取哪些数据
	 */
	@Test
	public void testV2Pull() {
		// 创建 可观察者 对象
		WeatherDataV2Pull wd = new WeatherDataV2Pull();
		
		// 创建 当前情况显示板 对象
		CurrentDisplayBoardV2 cdb = new CurrentDisplayBoardV2(wd);
		cdb.display();
		
		// 创建 平均情况显示板 对象
		AvgDisplayBoardV2 adb = new AvgDisplayBoardV2(wd);
		adb.display();
		
		// 改变观测数据
		wd.setMeasurements(80, 90, 100);
		wd.setMeasurements(81, 91, 101.3f);
		wd.setMeasurements(82, 92, 102.1f);
	}
}
