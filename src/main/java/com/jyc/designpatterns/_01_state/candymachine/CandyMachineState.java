package com.jyc.designpatterns._01_state.candymachine;

/**
 * <p>状态接口,不同的糖果机状态需要实现此接口
 * @author 贾玉晨
 * @date 2017年6月2日-下午5:23:36	 
 */
public interface CandyMachineState {

	/**
	 * 投币
	 */
	void inputCoin(CandyMachineContext context);
	
	/**
	 * 转动摇杆
	 */
	void turnJoystick(CandyMachineContext context);
	
	/**
	 * 退币
	 */
	void returnCoin(CandyMachineContext context);
	
	/**
	 * 发糖
	 */
	void dispenseCandy(CandyMachineContext context);
}
