package e_设计模式之行为型模式.中介者模式.例子1;

import java.text.MessageFormat;
import java.util.Date;

public class GroupChatMediator implements IGroupChatMediator {
	@Override
	public void sendMessage (String message, Student student) {
		String newMessage = "{0} [@{1}]: {2}";
		System.out.println( MessageFormat.format( newMessage, new Date(), student.getName(), message ) );
	}
}
