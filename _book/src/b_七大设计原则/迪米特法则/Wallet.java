package b_七大设计原则.迪米特法则;

public class Wallet {
	double money;

	// 获取钱包里有多少钱
	public double getMoney () {
		return money;
	}

	// 设置钱包里有多少钱
	public void setMoney (double money) {
		this.money = money;
	}

	// 往钱包里添加钱
	public void addMoney (double money) {
		this.money += money;
	}

	// 从钱包里提取钱
	public void subtractMoney (double money) {
		this.money -= money;
	}
}
