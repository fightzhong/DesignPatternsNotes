package e_设计模式之行为型模式.策略模式;

public class Shop {
	private Strategy strategy;
	public Shop (Strategy strategy) { this.strategy = strategy; }

	public void sell () {
		// 业务逻辑
		strategy.doActivity();
		// 业务逻辑
	}
}
