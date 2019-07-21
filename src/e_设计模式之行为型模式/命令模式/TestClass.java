package e_设计模式之行为型模式.命令模式;

public class TestClass {
	public static void main (String[] args) {
		// 创建命令作用的目标对象VideoPlayer
		VideoPlayer videoPlayer = new VideoPlayer();

		// 创建命令
		Command c1 = new OpenVideoCommand( videoPlayer );
		Command c2 = new PauseVideoCommand( videoPlayer );
		Command c3 = new StopVideoCommand( videoPlayer );

		// 创建命令的调用者
		Invoker invoker = new Invoker();
		invoker.addCommand( c1 );
		invoker.addCommand( c2 );
		invoker.addCommand( c3 );

		// 执行命令
		invoker.execute();
	}
}
