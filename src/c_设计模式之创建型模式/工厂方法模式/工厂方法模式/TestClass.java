package c_设计模式之创建型模式.工厂方法模式.工厂方法模式;

public class TestClass {
	public static void main (String[] args) {
	    Fruit apple = new AppleFactory().getFruit();
	    apple.produce();

	    Fruit orange = new OrangeFactory().getFruit();
	    orange.produce();
	}
}
