package com.jyc.designpatterns._01_state.candymachine;

import com.jyc.designpatterns._01_state.candymachine.impl.HasCoinState;
import com.jyc.designpatterns._01_state.candymachine.impl.NoCoinState;
import com.jyc.designpatterns._01_state.candymachine.impl.SoldOutState;
import com.jyc.designpatterns._01_state.candymachine.impl.SoldState;
import com.jyc.designpatterns._01_state.candymachine.impl.WinningSoldState;

/**
 * <p><strong>状态模式的实现类：糖果机上下文</strong>
 * 
 * <p>一个糖果机，从投币到出糖的过程。
 * <p>糖果机共5种状态：无币，已投币，发售糖果，中奖发售糖果，无糖。
 * <p>糖果机共3种操作：投币，退币，转动摇杆。
 * @author 贾玉晨
 * @date 2017年6月2日-下午1:52:11	 
 */
public class CandyMachineContext {

	// 无币状态
	private CandyMachineState noCoinState = new NoCoinState(); 
	
	// 已投币状态
	private CandyMachineState hasCoinState = new HasCoinState(); 
	
	// 出糖状态
	private CandyMachineState soldState = new SoldState(); 
	
	// 无糖状态
	private CandyMachineState soldOutState = new SoldOutState(); 
	
	// 中奖发糖状态
	private CandyMachineState winningSoldState = new WinningSoldState();
	
	// 糖果机当前状态
	private CandyMachineState currentState ; 
	
	// 当前糖果数量
	private int candyNum;
	
	// 默认10颗糖果的构造函数
	public CandyMachineContext() {
		this.candyNum = 10;
		this.currentState = noCoinState;
	}
	
	// 自定义糖果数量的构造函数
	public CandyMachineContext(int candyNum){
		this.candyNum = candyNum;
		
		if (candyNum > 0) {
			this.currentState = noCoinState;
		}else{
			this.currentState = soldOutState;
		}
	}
	
	/**
	 * 投入硬币
	 */
	public void inputCoin(){
		currentState.inputCoin(this);
	}
	
	/**
	 * 转动摇杆,发糖
	 */
	public void turnJoystick(){
		currentState.turnJoystick(this);
		if (currentState instanceof WinningSoldState) {
			System.out.println("中奖情况出现~");
		}
		currentState.dispenseCandy(this);
	}
	
	/**
	 * 退币操作
	 */
	public void returnCoin(){
		currentState.returnCoin(this);
	}
	
	public CandyMachineState getNoCoinState() {
		return noCoinState;
	}

	public void setNoCoinState(CandyMachineState noCoinState) {
		this.noCoinState = noCoinState;
	}

	public CandyMachineState getHasCoinState() {
		return hasCoinState;
	}

	public void setHasCoinState(CandyMachineState hasCoinState) {
		this.hasCoinState = hasCoinState;
	}

	public CandyMachineState getSoldState() {
		return soldState;
	}

	public void setSoldState(CandyMachineState soldState) {
		this.soldState = soldState;
	}

	public CandyMachineState getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(CandyMachineState soldOutState) {
		this.soldOutState = soldOutState;
	}

	public CandyMachineState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(CandyMachineState currentState) {
		this.currentState = currentState;
	}

	public int getCandyNum() {
		return candyNum;
	}

	public void setCandyNum(int candyNum) {
		this.candyNum = candyNum;
	}

	public CandyMachineState getWinningSoldState() {
		return winningSoldState;
	}

	public void setWinningSoldState(CandyMachineState winningSoldState) {
		this.winningSoldState = winningSoldState;
	}
	
	
}
