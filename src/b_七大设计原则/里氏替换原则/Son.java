package b_七大设计原则.里氏替换原则;

import java.util.HashMap;
import java.util.Map;

public class Son extends Father {
	public void fun (Map map) {
		System.out.println( "子类类方法被执行" );
	}
}
