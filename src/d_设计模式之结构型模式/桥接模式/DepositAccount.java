package d_设计模式之结构型模式.桥接模式;

public class DepositAccount implements Account {
	@Override
	public Account openAccount () {
		System.out.println( "打开活期账号" );
		return new DepositAccount();
	}

	@Override
	public void showAccoutType () {
		System.out.println( "这是一个活期账号" );
	}
}
