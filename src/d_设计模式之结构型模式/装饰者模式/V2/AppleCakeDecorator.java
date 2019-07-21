package d_设计模式之结构型模式.装饰者模式.V2;

public class AppleCakeDecorator extends CakeDecorator {
	private ACake cake;

	public AppleCakeDecorator (ACake cake) {
		this.cake = cake;
	}

	@Override
	public String getDescription () {
		return cake.getDescription() + ", 一块苹果";
	}

	@Override
	public int cost () {
		return cake.cost() + 3;
	}
}
