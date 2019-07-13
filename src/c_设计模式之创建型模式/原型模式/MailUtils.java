package c_设计模式之创建型模式.原型模式;

import java.text.MessageFormat;
import java.util.ArrayList;

public class MailUtils {
	public static void sendMail (Mail mail) {
		String mailContent = "收件人: {0}, 收件地址: {1}, 邮件内容: {2}, 其它内容: {3}";
		System.out.println( MessageFormat.format( mailContent, mail.getName(),
									mail.getAddress(), mail.getContent() ) );
	}

	public static String saveOriginMail (Mail mail) {
		return mail.getContent();
	}
}
