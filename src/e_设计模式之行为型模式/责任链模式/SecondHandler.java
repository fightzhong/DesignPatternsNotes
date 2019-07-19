package e_设计模式之行为型模式.责任链模式;

public class SecondHandler extends Handler {
	@Override
	public void handlerAction (String name) {
		if ( name.equals( "李四" ) || name.equals( "王五" ) ) {
			System.out.println( "申请员工为李四和王五中的其中一个, 批准!!" );
			return;
		} else {
			System.out.println( "申请员工为非特定员工, 我无法批准, 交给上一级领导批准" );
			nextHandler.handlerAction( name );
		}
	}
}
