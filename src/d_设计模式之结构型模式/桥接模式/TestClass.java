package d_设计模式之结构型模式.桥接模式;

public class TestClass {
	public static void main (String[] args) {
		Bank icbcBank = new ICBCBank( new DepositAccount() );
		Account icbcAccount = icbcBank.openAccount();
		icbcAccount.showAccoutType();

	}
}
