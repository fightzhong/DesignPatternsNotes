package d_设计模式之结构型模式.外观模式;

public class SingletonFacade {
	public final static SingletonFacade instance;

	static {
		instance = new SingletonFacade();
	}

	public static SingletonFacade getInstance () {
		return instance;
	}

	private Door door;
	private Light1 l1;
	private Light2 l2;
	private Light3 l3;
	private Air air;

	private SingletonFacade () {
		door = new Door();
		l1 = new Light1();
		l2 = new Light2();
		l3 = new Light3();
		air = new Air();
	}

	public void open () {
		door.open();
		l1.open();
		l2.open();
		l3.open();
		air.open();
	}
}
