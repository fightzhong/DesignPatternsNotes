package e_设计模式之行为型模式.责任链模式;

public class TopHandler extends Handler {
	@Override
	public void handlerAction (String name) {
		System.out.println( "批准!!!" );
	}
}
