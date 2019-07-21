package c_设计模式之创建型模式.工厂方法模式.简单工厂;

public class TestClass {
	public static void main (String[] args) {
	    Fruit apple = FruitFactory.getFruit( Apple.class );
	    apple.produce();

	    Fruit orange = FruitFactory.getFruit( Orange.class );
	    orange.produce();
	}
}
