package com.jyc.designpatterns._20_state.candymachine.impl;

import com.jyc.designpatterns._20_state.candymachine.CandyMachineContext;
import com.jyc.designpatterns._20_state.candymachine.CandyMachineState;

/**
 * <p> 无糖状态类
 * @author jyc
 *
 */
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

	/* <p> 当糖果机无糖时,投币和转动摇杆动作就会失败
	 * <p> 转动摇杆儿和出糖对外是连贯动作,因此在转动摇杆处发出警告即可
	 */
	@Override
	public void dispenseCandy(CandyMachineContext context) {
	}

	
	

}
