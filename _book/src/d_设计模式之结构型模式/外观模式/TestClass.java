package d_设计模式之结构型模式.外观模式;

public class TestClass {
	public static void main (String[] args) {
	   SingletonFacade facade = SingletonFacade.getInstance();
	   facade.open();
	}
}
