package b_七大设计原则.依赖倒置原则;

import org.junit.Test;

public class TestClass {
	public static void main () {
		People people = new People();
		// 吃苹果
		people.eatFruit( new Apple() );
		// 吃梨
		people.eatFruit( new Banana() );
	}
}
