package c_设计模式之创建型模式.工厂方法模式.工厂方法模式;

public class AppleFactory implements FruitFactory {
	@Override
	public Fruit getFruit () {
		return new Apple();
	}
}
