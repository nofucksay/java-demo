![demo](https://timgsa.baidu.com/timg?image&quality=100&size=b9999_10000&sec=1496257994028&di=ed139712c8999843a94f3c9647c7e3c3&imgtype=0&src=http%3A%2F%2Fimg.25pp.com%2Fuploadfile%2Fsoft%2Fimages%2F2014%2F0625%2F20140625092348710.jpg)

> ## 目录
> - [设计模式](#设计模式)
> 	+ [状态模式](#状态模式)
> ---

## 设计模式

+ ### 状态模式
	- #### 模式定义
		+ 状态模式，又称`状态对象模式`，状态模式是对象的行为模式。
		+ 状态模式允许一个对象在其内部状态改变的时候改变其行为。这个对象看上去就像是改变了它的类一样。
	- #### 使用场景
		> #### 糖果机：
		> + 实现一个糖果机从投币到出糖的过程。
		> + 糖果机共5种状态：无币，已投币，发售糖果，中奖发售糖果（10%几率），无糖。
		> + 糖果机共3种操作：投币，退币，转动摇杆。
		> + 代码地址：*[CandyMachine](https://github.com/nofucksay/java-demo/tree/master/src/main/java/com/jyc/designpatterns/_20_state/candymachine)*
