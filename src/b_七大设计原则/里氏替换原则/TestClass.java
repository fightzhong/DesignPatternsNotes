package b_七大设计原则.里氏替换原则;

import org.junit.Test;

import java.util.HashMap;

public class TestClass {
	@Test
	public void test () {
		HashMap map = new HashMap();

		Father fa = new Father();
		fa.fun( map );

		Son son = new Son();
		son.fun( map );

	}
}
