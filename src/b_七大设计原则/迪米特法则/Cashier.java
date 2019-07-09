package b_七大设计原则.迪米特法则;

public class Cashier {
	// 收钱
	public void pay (Customer customer) {
		Wallet wallet = customer.getWallet();
		wallet.subtractMoney( 100 );
	}
}
