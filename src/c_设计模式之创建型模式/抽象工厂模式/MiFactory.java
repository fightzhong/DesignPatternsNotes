package c_设计模式之创建型模式.抽象工厂模式;

public class MiFactory extends Factory {
	@Override
	public Phone getPhone () {
		return new MiPhone();
	}

	@Override
	public Box getBox () {
		return new MiBox();
	}
}
