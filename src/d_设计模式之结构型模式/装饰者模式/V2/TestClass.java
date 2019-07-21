package d_设计模式之结构型模式.装饰者模式.V2;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestClass {
	public static void main (String[] args) {
		// 一块蛋糕
		ACake cake = new Cake();
		System.out.println( cake.getDescription() );

		// 蛋糕内放一块苹果
		AppleCakeDecorator decorator = new AppleCakeDecorator( cake );
		System.out.println( decorator.getDescription() );

		// 蛋糕内再放一块苹果
		decorator = new AppleCakeDecorator( decorator );
		System.out.println( decorator.getDescription() );

		// 蛋糕内继续放一块苹果
		decorator = new AppleCakeDecorator( decorator );
		System.out.println( decorator.getDescription() );

	}
}
