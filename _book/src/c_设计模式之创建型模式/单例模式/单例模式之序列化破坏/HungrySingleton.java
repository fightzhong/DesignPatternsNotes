package c_设计模式之创建型模式.单例模式.单例模式之序列化破坏;

import java.io.Serializable;

public class HungrySingleton implements Serializable {
	private final static HungrySingleton hungrySingleton;
	static {
		hungrySingleton = new HungrySingleton();
	}
	private HungrySingleton () {}
	public static HungrySingleton getInstance () {
		return hungrySingleton;
	}

	private Object readResolve () {
		return hungrySingleton;
	}
}
