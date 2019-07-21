package d_设计模式之结构型模式.装饰者模式.V2;

public class Cake extends ACake {
	@Override
	public String getDescription () {
		return "一个蛋糕";
	}

	@Override
	public int cost () {
		return 10;
	}
}
