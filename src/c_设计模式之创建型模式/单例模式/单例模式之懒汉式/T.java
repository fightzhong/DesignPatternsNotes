package c_设计模式之创建型模式.单例模式.单例模式之懒汉式;

public class T implements Runnable {
	@Override
	public void run () {
		c_设计模式之创建型模式.单例模式.单例模式之懒汉模式.LazySingleton instance = c_设计模式之创建型模式.单例模式.单例模式之懒汉模式.LazySingleton.getInstance();
		System.out.println( Thread.currentThread().getName() + " : " + instance );
	}
}
