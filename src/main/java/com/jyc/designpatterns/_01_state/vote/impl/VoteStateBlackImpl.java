package com.jyc.designpatterns._01_state.vote.impl;

import com.jyc.designpatterns._01_state.vote.VoteManager;
import com.jyc.designpatterns._01_state.vote.VoteState;

/**
 * TODO 黑名单状态的处理器
 * @author 贾玉晨
 * @date 2017年5月31日-下午11:38:36	 
 */
public class VoteStateBlackImpl implements VoteState{

	@Override
	public void doVote(String voterName, String voteItem, VoteManager vm) {
		
		// 加入黑名单,禁止登录系统
		
		System.out.println("次数太多啦,永世不能登录本系统啦！");
	}
	
}
