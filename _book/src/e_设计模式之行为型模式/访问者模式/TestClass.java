package e_设计模式之行为型模式.访问者模式;

public class TestClass {
	public static void main (String[] args) {
	   // 现在一位病人拿到了医生开的药单
		药单 yaodan = new 药单();

		// 创建一个报价员, 并将药单给报价员报价
		报价员 baojiayuan = new 报价员();
		yaodan.accept( baojiayuan );

		// 创建一个取药员, 并将药单给取药员取药
		取药员 quyaoyuan = new 取药员();
		yaodan.accept( quyaoyuan );
	}
}
