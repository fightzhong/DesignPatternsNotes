package c_设计模式之创建型模式.单例模式.单例模式之饿汉式;

import java.io.Serializable;

public class HungrySingleton {
	private final static HungrySingleton hungrySingleton;
	static {
		hungrySingleton = new HungrySingleton();
	}
	private HungrySingleton () {}
	public static HungrySingleton getInstance () {
		return hungrySingleton;
	}
}
