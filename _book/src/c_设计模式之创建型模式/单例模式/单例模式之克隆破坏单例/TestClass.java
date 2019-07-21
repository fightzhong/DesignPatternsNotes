package c_设计模式之创建型模式.单例模式.单例模式之克隆破坏单例;

public class TestClass {
	public static void main (String[] args) throws CloneNotSupportedException {
	    LazySingleton instance = LazySingleton.getInstance();
	    LazySingleton newInstance = (LazySingleton) instance.clone();

		System.out.println( instance );
		System.out.println( newInstance );
	}
}
