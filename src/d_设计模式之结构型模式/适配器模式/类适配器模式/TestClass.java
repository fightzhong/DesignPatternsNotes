package d_设计模式之结构型模式.适配器模式.类适配器模式;

public class TestClass {
	public static void main (String[] args) {
		Electric_5V output5V = new ElectricAdaptor();
		output5V.output5VElectric();
	}
}
