package c_设计模式之创建型模式.单例模式.单例模式之克隆破坏单例;

public class LazySingleton implements Cloneable {
	private volatile static LazySingleton instance;
	private LazySingleton () {}

	public static LazySingleton getInstance () {
		if ( instance == null ) {
			synchronized ( LazySingleton.class ) {
				if ( instance == null ) {
					instance = new LazySingleton();
				}
			}
		}

		return instance;
	}

	@Override
	protected Object clone () throws CloneNotSupportedException {
		return instance;
	}
}
