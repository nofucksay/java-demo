package com.jyc.designpatterns._01_state.candymachine;

import org.junit.Test;

public class CandyMachineClient {

	/**
	 * 投币,摇杆
	 */
	@Test
	public void candyTest01(){
		CandyMachineContext cm = new CandyMachineContext();
		cm.inputCoin();
		cm.turnJoystick();
	}
	
	
	/**
	 * 投币,退币,摇杆
	 */
	@Test
	public void candyTest02(){
		CandyMachineContext cm = new CandyMachineContext();
		cm.inputCoin();
		cm.returnCoin();
		cm.turnJoystick();
	}
	
	
	/**
	 * 投币,退币,投币,摇杆
	 */
	@Test
	public void candyTest03(){
		CandyMachineContext cm = new CandyMachineContext();
		cm.inputCoin();
		cm.returnCoin();
		cm.inputCoin();
		cm.turnJoystick();
	}
	
	/**
	 * 退币
	 */
	@Test
	public void candyTest04(){
		CandyMachineContext cm = new CandyMachineContext();
		cm.returnCoin();
	}
	
	/**
	 * 摇杆
	 */
	@Test
	public void candyTest05(){
		CandyMachineContext cm = new CandyMachineContext();
		cm.turnJoystick();
	}
	
	
	/**
	 * 测试中奖状态
	 */
	@Test
	public void candyTest06(){
		CandyMachineContext cm = new CandyMachineContext(100);
		for (int i = 0; i < 101; i++) {
			System.out.printf("第%d轮\n",(i+1));
			cm.inputCoin();
			cm.turnJoystick();
		}
	}
}
