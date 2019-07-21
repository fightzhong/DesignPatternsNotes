package d_设计模式之结构型模式.代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DaoHandler implements InvocationHandler {
	private Object target;

	public DaoHandler (Object target) {
		this.target = target;
	}

	@Override
	public Object invoke (Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		System.out.println("操作数据库开始");
		result = method.invoke(target, args);
		System.out.println("操作数据库结束");


		return result;
	}
}
