package e_设计模式之行为型模式.命令模式;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	private List<Command> allCommand = new ArrayList<>();

	/**
	 * 添加命令
	 * @param command
	 */
	public void addCommand (Command command) {
		allCommand.add( command );
	}
	/**
	 * 执行操作
	 */
	public void execute () {
		for ( Command c: allCommand ){
			c.executeCommand();
		}
	}
}
