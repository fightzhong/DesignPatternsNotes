package e_设计模式之行为型模式.观察者模式;

public class G1 implements GrilFriend {
	private String name; // 名字

	public G1 (String name) {
		this.name = name;
	};
	@Override
	public void getMessage (String message, String bf) {
		System.out.println( bf + "的女朋友" + name + "收到"+ bf +"的消息: " + message );
	}
}
