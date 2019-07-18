package e_设计模式之行为型模式.观察者模式;

public class TestClass {
	public static void main (String[] args) {
		GrilFriend g1 = new G1( "小冰" );
		GrilFriend g2 = new G1( "小红" );
		GrilFriend g3 = new G1( "小晴" );

		AbstractFuErDai xiaowang = new FuErDai( "小王" );
		xiaowang.attachGrilFriend( g1 );
		xiaowang.attachGrilFriend( g2 );
		xiaowang.attachGrilFriend( g3 );

		xiaowang.notifyAllGrilFriend( "今晚我们一起共进晚餐..." );
	}
}
