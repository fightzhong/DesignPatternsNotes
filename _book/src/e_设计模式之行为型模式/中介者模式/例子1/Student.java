package e_设计模式之行为型模式.中介者模式.例子1;

public class Student {
	private String name;
	private IGroupChatMediator groupChatMediator;

	public Student (String name, IGroupChatMediator groupChatMediator) {
		this.name = name;
		this.groupChatMediator = groupChatMediator;
	}

	public String getName () {
		return name;
	}

	public void sendMessage (String message) {
		groupChatMediator.sendMessage( message, this );
	}
}
