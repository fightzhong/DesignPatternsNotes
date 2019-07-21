package b_七大设计原则.开闭原则;

import org.junit.Test;

public class TestClass {
	@Test
	public void test () {
		AppleDiscount appleDiscount = new AppleDiscount( 1, "苹果", 100, 8 );
		System.out.println( appleDiscount.getDiscountPrice() + "   " + appleDiscount.getOriginPrice() );
	}
}
