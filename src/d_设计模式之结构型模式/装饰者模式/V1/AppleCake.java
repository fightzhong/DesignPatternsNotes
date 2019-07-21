package d_设计模式之结构型模式.装饰者模式.V1;

public class AppleCake extends Cake {
	@Override
	public String getDesription () {
		return super.getDesription() + ", 一块苹果";
	}

	@Override
	public int cost () {
		return super.cost() + 10;
	}
}
