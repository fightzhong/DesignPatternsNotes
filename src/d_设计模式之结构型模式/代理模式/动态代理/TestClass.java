package d_设计模式之结构型模式.代理模式.动态代理;

import java.lang.reflect.Proxy;

public class TestClass {
	public static void main (String[] args) {
		IDao dao = new DaoImpl();
		DaoHandler handler = new DaoHandler( dao );

		IDao proxy = (IDao) Proxy.newProxyInstance( dao.getClass().getClassLoader(),
		dao.getClass().getInterfaces(), handler);

		proxy.insert();
	}
}
