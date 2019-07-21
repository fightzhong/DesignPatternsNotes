package d_设计模式之结构型模式.桥接模式;

public class ICBCBank extends Bank {
	public ICBCBank (Account account) {
		super(account);
	}

	@Override
	Account openAccount () {
		System.out.println( "打开中国工商银行" );
		account.openAccount();
		return account;
	}
}
