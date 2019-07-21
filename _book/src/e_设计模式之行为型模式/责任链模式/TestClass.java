package e_设计模式之行为型模式.责任链模式;

public class TestClass {
	public static void main (String[] args) {
		Handler firHandler = new FirstHandler();
		Handler secondHandler = new SecondHandler();
		Handler topHandler = new TopHandler();

		// 生成责任链
		firHandler.setNextHandler( secondHandler );
		secondHandler.setNextHandler( topHandler );

		// 张三的申请
		firHandler.handlerAction( "张三" );
		System.out.println( "==============================" );

		// 李四的申请
		firHandler.handlerAction( "李四" );
		System.out.println( "==============================" );

		// 二狗的申请
		firHandler.handlerAction( "二狗" );
	}
}
