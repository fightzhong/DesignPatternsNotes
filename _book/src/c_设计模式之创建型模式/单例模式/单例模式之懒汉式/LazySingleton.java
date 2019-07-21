package c_设计模式之创建型模式.单例模式.单例模式之懒汉模式;

public class LazySingleton {
	private LazySingleton () {}
	private volatile static LazySingleton lazySingleton = null;

	private static class InnerClass {
		public static LazySingleton lazySingleton = new LazySingleton();
	}

	public static LazySingleton getInstance () {
		return InnerClass.lazySingleton;
	}

	// public static LazySingleton getInstance () {
	// 	if ( lazySingleton == null ) {
	// 		synchronized ( LazySingleton.class ) {
	// 			if ( lazySingleton == null ) {
	// 				lazySingleton = new LazySingleton();
	// 			}
	// 		}
	// 	}
	// 	return lazySingleton;
	// }
}
