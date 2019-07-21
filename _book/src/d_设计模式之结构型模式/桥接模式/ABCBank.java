package d_设计模式之结构型模式.桥接模式;

public class ABCBank extends Bank {
	public ABCBank (Account account) {
		super(account);
	}

	@Override
	Account openAccount () {
		System.out.println( "打开中国农业银行" );
		account.openAccount();
		return account;
	}
}
