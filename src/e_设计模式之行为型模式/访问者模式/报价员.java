package e_设计模式之行为型模式.访问者模式;

public class 报价员 implements Visitor {
	// 报价员的职责就是计算药的总价格
	@Override
	public void look (药单 yaodan) {
		// 对药单的属性进行查看, 获取每一类药品的数量
		System.out.println( "报价员查看每一类药品数量" );
		System.out.println( "报价员通过数量和单价计算出总的价格为100元" );
	}
}
