package com.jyc.designpatterns._20_state;

import java.util.HashMap;
import java.util.Map;

import com.jyc.designpatterns._20_state.impl.VoteStateBanImpl;
import com.jyc.designpatterns._20_state.impl.VoteStateBlackImpl;
import com.jyc.designpatterns._20_state.impl.VoteStateNormalImpl;
import com.jyc.designpatterns._20_state.impl.VoteStateRepeatImpl;

/**
 * TODO 投票管理器,客户端与该管理器通信,由此管理器根据不同投票状态创建对应状态的处理器进行投票处理。
 * 
 * @author 贾玉晨
 * @date 2017年5月31日-下午11:41:31
 */
public class VoteManager {

	public Map<String, String> voteItemMap = new HashMap<String, String>();

	public Map<String, Integer> voteCountMap = new HashMap<String, Integer>();

	public void vote(String voterName, String voteItem) throws Exception {
		VoteState voteState = null;
		Integer count = voteCountMap.get(voterName);

		if (count == null) {
			count = 0;
		}
		count += 1;
		voteCountMap.put(voterName, count);
		if (count == 1) {
			voteState = new VoteStateNormalImpl();
		} else if (count > 1 && count < 5) {
			voteState = new VoteStateRepeatImpl();
		} else if (count >= 5 && count < 8) {
			voteState = new VoteStateBanImpl();
		} else if (count >= 8) {
			voteState = new VoteStateBlackImpl();
		} else {
			throw new Exception("非法值");
		}
		voteState.doVote(voterName, voteItem, this);
	}
}
