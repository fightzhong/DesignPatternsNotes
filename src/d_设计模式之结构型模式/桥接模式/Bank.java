package d_设计模式之结构型模式.桥接模式;

public abstract class Bank {
	protected Account account;

	public Bank (Account account) {
		this.account = account;
	}

	abstract Account openAccount ();
}
