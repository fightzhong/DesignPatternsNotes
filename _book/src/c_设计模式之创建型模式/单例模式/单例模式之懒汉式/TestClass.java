package c_设计模式之创建型模式.单例模式.单例模式之懒汉式;

public class TestClass {
	public static void main (String[] args) {

		Thread t1 = new Thread( new T() );
		Thread t2 = new Thread ( new T() );
		t1.start();
		t2.start();

		System.out.println( "主线程执行完毕..." );
	}
}
