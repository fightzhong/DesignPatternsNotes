package d_设计模式之结构型模式.适配器模式.对象适配器模式;

public class TestClass {
	public static void main (String[] args) {
		Electric_5V output5V = new ElectricAdaptor();
		int output = output5V.output5VElectric();
		System.out.println( "输出的电流是" + output );
	}
}
