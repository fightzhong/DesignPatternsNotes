package b_七大设计原则.迪米特法则;

public class Customer {
	String name;
	Wallet wallet;

	// 拿出钱包
	public Wallet getWallet () {
		return wallet;
	}
}
