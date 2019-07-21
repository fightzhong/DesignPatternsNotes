package c_设计模式之创建型模式.工厂方法模式.简单工厂;

public class FruitFactory {
	public static Fruit getFruit (Class cl) {
		Fruit fruit = null;

		try {
			fruit = (Fruit)Class.forName( cl.getName() ).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return fruit;
	}
}
