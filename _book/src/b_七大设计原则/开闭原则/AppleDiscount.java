package b_七大设计原则.开闭原则;

public class AppleDiscount extends Apple {
	private int discountRate;     // 打折率

	public AppleDiscount (int id, String name, double price, int discountRate) {
		super( id, name, price );
		this.discountRate = discountRate;
	}

	public double getDiscountPrice () {
		return price * discountRate / 10;
	}

	public double getOriginPrice () {
		return price;
	}

	public int getDiscountRate () {
		return discountRate;
	}

	public void setDiscountRate (int discountRate) {
		this.discountRate = discountRate;
	}
}
