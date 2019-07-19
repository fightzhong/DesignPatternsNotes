package e_设计模式之行为型模式.访问者模式;

public class 取药员 implements Visitor {
	@Override
	public void look (药单 yaodan) {
		System.out.println( "取药员依次取出指定数量的每一种药品" );
	}
}
