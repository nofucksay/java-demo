package com.jyc.designpatterns._20_state.candymachine.impl;

import com.jyc.designpatterns._20_state.candymachine.CandyMachineContext;
import com.jyc.designpatterns._20_state.candymachine.CandyMachineState;

public class SoldOutState implements CandyMachineState {

	@Override
	public void inputCoin(CandyMachineContext context) {
		System.out.println("糖已卖光,请到退币口领取硬币~");
	}

	@Override
	public void turnJoystick(CandyMachineContext context) {
		System.out.println("没糖了,别再摇了~");
		
	}

	@Override
	public void returnCoin(CandyMachineContext context) {
		System.out.println("没糖了,退毛线~");
		
	}

	@Override
	public void dispenseCandy(CandyMachineContext context) {
		System.out.println("没糖了,出毛线~");
		
	}

	
	

}
