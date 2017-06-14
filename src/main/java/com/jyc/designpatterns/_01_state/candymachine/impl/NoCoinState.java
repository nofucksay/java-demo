package com.jyc.designpatterns._01_state.candymachine.impl;

import com.jyc.designpatterns._01_state.candymachine.CandyMachineContext;
import com.jyc.designpatterns._01_state.candymachine.CandyMachineState;

/**
 * <p> 无币状态类
 * @author jyc
 *
 */
public class NoCoinState implements CandyMachineState {

	@Override
	public void inputCoin(CandyMachineContext context) {
		System.out.println("投币成功,请摇杆取糖~");
		context.setCurrentState(context.getHasCoinState());
		
	}

	@Override
	public void turnJoystick(CandyMachineContext context) {
		System.out.println("对不起,请先投币再摇杆~");
		
	}

	@Override
	public void returnCoin(CandyMachineContext context) {
		System.out.println("对不起,无币可退~");
		
	}

	@Override
	public void dispenseCandy(CandyMachineContext context) {
		System.out.println("对不起,想吃糖请先投币");
		
	}

	
	

}
