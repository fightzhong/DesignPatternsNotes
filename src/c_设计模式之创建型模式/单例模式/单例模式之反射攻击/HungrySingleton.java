package c_设计模式之创建型模式.单例模式.单例模式之反射攻击;

public class HungrySingleton {
	private HungrySingleton () {
		if ( hungrySingleton != null ) {
			throw new RuntimeException( "单例模式不允许增加反射攻击" );
		}
	}
	private static HungrySingleton hungrySingleton;

	public static HungrySingleton getInstance () {
		if ( hungrySingleton == null ) {
			synchronized ( HungrySingleton.class ) {
				if ( hungrySingleton == null ) {
					hungrySingleton = new HungrySingleton();
				}
			}
		}

		return hungrySingleton;
	}
}
