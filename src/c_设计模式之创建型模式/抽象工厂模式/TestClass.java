package c_设计模式之创建型模式.抽象工厂模式;

public class TestClass {
	public static void main (String[] args) {
	   MiFactory miFactory = new MiFactory();
		Phone miPhone = miFactory.getPhone();
		Box miBox = miFactory.getBox();
		miPhone.produce();
		miBox.produce();

		HuaWeiFactory huaWeiFactory= new HuaWeiFactory();
		Phone huaWeiPhone = huaWeiFactory.getPhone();
		Box huaWeiBox = huaWeiFactory.getBox();
		huaWeiPhone.produce();
		huaWeiBox.produce();

	}
}
