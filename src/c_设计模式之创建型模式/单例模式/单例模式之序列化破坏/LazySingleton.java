package c_设计模式之创建型模式.单例模式.单例模式之序列化破坏;

import java.io.Serializable;

public class LazySingleton implements Serializable  {
	private LazySingleton () {}
	private static class InnerClass {
		private static LazySingleton lazySingleton = new LazySingleton();
	}

	public static LazySingleton getInstance () {
		return InnerClass.lazySingleton;
	}

	private Object readResolve () {
		return InnerClass.lazySingleton;
	}
}
