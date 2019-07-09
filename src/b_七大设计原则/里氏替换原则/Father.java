package b_七大设计原则.里氏替换原则;

import java.util.HashMap;
import java.util.Map;

public class Father {
	public void fun (HashMap map) {
		System.out.println( "父类方法被执行" );
	}
}
