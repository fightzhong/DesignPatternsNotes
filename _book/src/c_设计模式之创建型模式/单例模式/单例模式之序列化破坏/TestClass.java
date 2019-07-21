package c_设计模式之创建型模式.单例模式.单例模式之序列化破坏;

import java.io.*;

public class TestClass {
	public static void main (String[] args) throws IOException, ClassNotFoundException {
		// 获取饿汉模式的单例对象
		LazySingleton instance = LazySingleton.getInstance();
		// 序列化该对象, 序列化
		ObjectOutputStream output = new ObjectOutputStream( new FileOutputStream( "serializableFile1" ));
		output.writeObject( instance );

		// 反序列化
		ObjectInputStream input = new ObjectInputStream( new FileInputStream( "serializableFile1" ) );
		LazySingleton newInstance = (LazySingleton) input.readObject();

		// 判断
		System.out.println( instance );
		System.out.println( newInstance );
		System.out.println( instance == newInstance );
	}
}
