package b_七大设计原则.依赖倒置原则;

public class People {
	public void eatFruit (Fruit fruit) {
		System.out.println( "人在吃" + fruit.getName() );
	}
}
