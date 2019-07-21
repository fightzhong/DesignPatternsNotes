package c_设计模式之创建型模式.单例模式.单例模式之反射攻击;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestClass {
	public static void main (String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {


	    // 对HungrySingleton进行反射
		Class cl = Class.forName( HungrySingleton.class.getName() );
		Constructor constructor = cl.getDeclaredConstructor();
		constructor.setAccessible( true );
		HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();

		HungrySingleton instance = HungrySingleton.getInstance();

		// 比较
		System.out.println( instance );
		System.out.println( newInstance );
		System.out.println( instance == newInstance );
	}
}
