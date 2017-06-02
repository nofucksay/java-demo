package com.jyc.designpatterns._20_state.candymachine.impl;

import com.jyc.designpatterns._20_state.candymachine.CandyMachineContext;
import com.jyc.designpatterns._20_state.candymachine.CandyMachineState;

public class SoldState implements CandyMachineState {

	@Override
	public void inputCoin(CandyMachineContext context) {
		System.out.println("请稍后再投币,正在出糖~");
		
	}

	@Override
	public void turnJoystick(CandyMachineContext context) {
		System.out.println("摇多少次也没用,只给你1颗糖哦~");
		
	}

	@Override
	public void returnCoin(CandyMachineContext context) {
		System.out.println("自己摇的杆儿,跪着也要把糖吃掉~");
		
	}

	@Override
	public void dispenseCandy(CandyMachineContext context) {
		int candyNum = context.getCandyNum();
		candyNum -= 1;
		if (candyNum > 0) {
			context.setCurrentState(context.getNoCoinState());
		}else{
			context.setCurrentState(context.getSoldOutState());
		}
		System.out.println("已出糖,请领取~");
	}

	
	

}
