package com.jyc.designpatterns._20_state.vote.impl;

import com.jyc.designpatterns._20_state.vote.VoteManager;
import com.jyc.designpatterns._20_state.vote.VoteState;

/**
 * TODO 重复状态的处理器
 * @author 贾玉晨
 * @date 2017年5月31日-下午11:40:17	 
 */
public class VoteStateRepeatImpl implements VoteState{

	@Override
	public void doVote(String voterName, String voteItem, VoteManager vm) {
		
		// 重复投票,暂时不做处理
		
		System.out.println("您已经投过票,请不要重复投票！");
	}
	
}
