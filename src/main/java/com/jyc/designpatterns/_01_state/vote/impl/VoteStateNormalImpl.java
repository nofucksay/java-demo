package com.jyc.designpatterns._01_state.vote.impl;

import com.jyc.designpatterns._01_state.vote.VoteManager;
import com.jyc.designpatterns._01_state.vote.VoteState;

/**
 * TODO 正常状态的处理器
 * @author 贾玉晨
 * @date 2017年5月31日-下午11:39:19	 
 */
public class VoteStateNormalImpl implements VoteState{

	@Override
	public void doVote(String voterName, String voteItem, VoteManager vm) {
		// 进行投票
		vm.voteItemMap.put(voterName, voteItem);
		System.out.println("恭喜,投票成功!");
	}
	
}
