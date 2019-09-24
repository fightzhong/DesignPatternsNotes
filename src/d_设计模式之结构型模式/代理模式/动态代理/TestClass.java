import java.lang.reflect.Proxy;

public class TestClass {
	public static void main (String[] args) {
		IDao dao = new IDaoImpl();
		IDao daoProxy = ( IDao )Proxy.newProxyInstance( dao.getClass().getClassLoader(), dao.getClass().getInterfaces(),
		(proxy, method, arg) -> {
			Object result = null;
			if ( method.getName().equals( "insert" ) ) {
				System.out.println( "insert方法被调用" );
				result = method.invoke( dao, arg );
				System.out.println( "insert方法调用结束" );
			}
			return result;
		} );
	}
}
