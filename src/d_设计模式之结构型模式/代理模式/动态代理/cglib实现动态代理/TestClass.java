package cglib实现动态代理;


public class TestClass {
	public static void main (String[] args) {
		// 创建一个被代理对象
		Person per = new Person();
		Enhancer enhancer = new Enhancer();
		/**
		 * 代理方法的实现(等价于InvocationHandler中的invoke方法), 这里需要传入一个Callback类型的对象
		 * MethodInterceptor是一个继承了Callback接口的函数式接口
		 * Object obj: this, 代表enhancer对象
		 * java.lang.reflect.Method method: 被代理的方法, 等价于InvocationHandler中invoke方法的method参数
		 * Object[] args: method方法的参数
		 * MethodProxy proxy: 生成的代理类对象
 		 */
		enhancer.setCallback( (MethodInterceptor)(obj, method, arg, proxy) -> {
			System.out.println( "洗手" );
			Object result = method.invoke(per, arg);
			System.out.println( "收拾东西" );
			return result;
		} );

		// 设置代理类的父类, 因为CGlib是通过生成子类的方式来进行代理的, 所以需要声明被代理类作为父类
		enhancer.setSuperclass( per.getClass() );

		// 通过create方法创建代理类对象
		Person perProxy = (Person)enhancer.create();
		// 调用方法
		perProxy.eat();
	}
}
