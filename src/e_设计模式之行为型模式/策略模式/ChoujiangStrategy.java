package e_设计模式之行为型模式.策略模式;

public class ChoujiangStrategy implements Strategy {
	@Override
	public void doActivity () {
		System.out.println( "抽奖活动启动" );
	}
}
