package d_设计模式之结构型模式.代理模式.静态代理;

public class TestClass {
	public static void main (String[] args) {
		DaoProxy proxy = new DaoProxy( new DaoImpl() );
		proxy.insert();
	}
}
