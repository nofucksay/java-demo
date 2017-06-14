package com.jyc.designpatterns._01_state.vote.impl;

import com.jyc.designpatterns._01_state.vote.VoteManager;
import com.jyc.designpatterns._01_state.vote.VoteState;

/**
 * TODO 取消资格状态的处理器
 * @author 贾玉晨
 * @date 2017年5月31日-下午11:40:27	 
 */
public class VoteStateBanImpl implements VoteState{

	@Override
	public void doVote(String voterName, String voteItem, VoteManager vm) {
		vm.voteItemMap.remove(voterName);
		System.out.println("涉嫌恶意刷票,取消投票资格！");
	}
	
}
