package c_设计模式之创建型模式.抽象工厂模式;

public class HuaWeiPhone extends Phone {
	@Override
	public void produce () {
		System.out.println( "生产华为手机..." );
	}
}
