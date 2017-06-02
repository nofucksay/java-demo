package com.jyc.designpatterns._20_state.candymachine.impl;

import com.jyc.designpatterns._20_state.candymachine.CandyMachineContext;
import com.jyc.designpatterns._20_state.candymachine.CandyMachineState;

/**
 * <p> 已投币状态类
 * @author jyc
 *
 */
public class HasCoinState implements CandyMachineState {

	@Override
	public void inputCoin(CandyMachineContext context) {
		System.out.println("您已经投过币了,请到退币口领币~");
		
	}

	@Override
	public void turnJoystick(CandyMachineContext context) {
		System.out.println("你转动了摇杆~");
		int candyNum = context.getCandyNum();
		int winNumber = (int) (Math.random() * 10);
		if (candyNum >= 2 && winNumber == 0) {
			context.setCurrentState(context.getWinningSoldState());
		}else{
			context.setCurrentState(context.getSoldState());
		}
	}

	@Override
	public void returnCoin(CandyMachineContext context) {
		System.out.println("退币成功,请到退币口领取~");
		context.setCurrentState(context.getNoCoinState());
	}

	@Override
	public void dispenseCandy(CandyMachineContext context) {
		System.out.println("请先转动摇杆,否则无法出糖~");
		
	}

	
	

}
