package com.jyc.designpatterns._20_state;

/**
 * TODO 处理不同投票状态的接口
 * @author 贾玉晨
 * @date 2017年5月31日-下午11:41:14	 
 */
public interface VoteState {

	void doVote(String voterName, String voteItem, VoteManager vm);
}
