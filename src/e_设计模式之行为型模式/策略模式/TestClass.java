package e_设计模式之行为型模式.策略模式;

public class TestClass {
	public static void main (String[] args) {

		Shop shop = new Shop( StrategyFactory.getStrategy( StrategyFactory.ActivityType.CHOU_JIANG ) );
		shop.sell();

		shop = new Shop( StrategyFactory.getStrategy( StrategyFactory.ActivityType.DA_ZHE ) );
		shop.sell();

		shop = new Shop( StrategyFactory.getStrategy( StrategyFactory.ActivityType.CHOU_JIANG ) );
		shop.sell();
	}
}
