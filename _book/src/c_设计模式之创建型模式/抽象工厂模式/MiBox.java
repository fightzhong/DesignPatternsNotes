package c_设计模式之创建型模式.抽象工厂模式;

public class MiBox extends Box {
	@Override 
	public void produce () {
		System.out.println( "生产小米冰箱..." );
	}
}
