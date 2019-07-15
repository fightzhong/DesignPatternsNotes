package d_设计模式之结构型模式.桥接模式;

public class SavingAccount implements Account {
	@Override
	public Account openAccount () {
		System.out.println( "打开定期账号" );
		return new SavingAccount();
	}

	@Override
	public void showAccoutType () {
		System.out.println( "这是一个定期账号" );
	}
}
