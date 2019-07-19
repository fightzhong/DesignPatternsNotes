package e_设计模式之行为型模式.访问者模式;

public class 药单 {
	private int 板蓝根数量;
	private int 阿莫西林数量;
	private int 退烧药数量;
	private int 感冒灵数量;

	// setter && getter
	public int get板蓝根数量 () {
		return 板蓝根数量;
	}

	public void set板蓝根数量 (int 板蓝根数量) {
		this.板蓝根数量 = 板蓝根数量;
	}

	public int get阿莫西林数量 () {
		return 阿莫西林数量;
	}

	public void set阿莫西林数量 (int 阿莫西林数量) {
		this.阿莫西林数量 = 阿莫西林数量;
	}

	public int get退烧药数量 () {
		return 退烧药数量;
	}

	public void set退烧药数量 (int 退烧药数量) {
		this.退烧药数量 = 退烧药数量;
	}

	public int get感冒灵数量 () {
		return 感冒灵数量;
	}

	public void set感冒灵数量 (int 感冒灵数量) {
		this.感冒灵数量 = 感冒灵数量;
	}

	// 接收一个访问者, 来对这个药单进行操作
	public void accept (Visitor visitor) {
		visitor.look( this );
	}
}
