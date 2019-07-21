package e_设计模式之行为型模式.中介者模式.例子1;

public class TestClass {
	public static void main (String[] args) {
		IGroupChatMediator groupChatMediator = new GroupChatMediator();
		Student zhangsan = new Student( "张三", groupChatMediator );
		Student lisi = new Student( "李四", groupChatMediator );

		zhangsan.sendMessage( "李四, 中午我们一起吃饭吧" );
		lisi.sendMessage( "好的, 我们去吃食堂" );
	}
}
