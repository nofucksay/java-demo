package com.jyc.designpatterns._01_state.candymachine.impl;

import com.jyc.designpatterns._01_state.candymachine.CandyMachineContext;

/**
 * <p> 中奖时的发售糖果状态类
 * @author jyc
 *
 */
public class WinningSoldState extends SoldState {

	
	/* 
	 * 中奖时发2颗糖果
	 */
	@Override
	public void dispenseCandy(CandyMachineContext context) {
		int candyNum = context.getCandyNum();
		candyNum -= 2;
		context.setCandyNum(candyNum);
		if (candyNum > 0) {
			context.setCurrentState(context.getNoCoinState());
		}else{
			context.setCurrentState(context.getSoldOutState());
		}
		System.out.println("恭喜你中奖,免费送1颗糖,已出糖,请领取~");
	}

	
}
