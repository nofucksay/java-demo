package com.jyc.designpatterns._01_state.vote;

/**
 * TODO 测试状态模式的客户端,模拟场景：用户投票
 * @author 贾玉晨
 * @date 2017年5月31日-下午11:40:50	 
 */
public class Client {

	public static void main(String[] args) throws Exception {
		VoteManager vc = new VoteManager();
		for (int i = 0; i < 8; i++) {
			vc.vote("A", i+"");
		}
	}
}
