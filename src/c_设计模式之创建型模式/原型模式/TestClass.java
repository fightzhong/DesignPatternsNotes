package c_设计模式之创建型模式.原型模式;

import java.util.ArrayList;

public class TestClass {
	public static void main (String[] args) throws CloneNotSupportedException {
		// Mail mail = new Mail();
		// for ( int i = 0; i < 10; i ++ ) {
		// 	Mail temp = (Mail) mail.clone();
		// 	temp.setName( "姓名" + i );
		// 	temp.setAddress( "姓名" + i + "@qq.com" );
		// 	temp.setContent( "恭喜你, 收到了邮件..." );
		// 	MailUtils.sendMail( temp );
		// }
		Origin origin = new Origin();
		origin.setList( new ArrayList<>() );

		Origin newOrigin = (Origin) origin.clone();
		System.out.println( origin.getList() == newOrigin.getList() );


	}
}
