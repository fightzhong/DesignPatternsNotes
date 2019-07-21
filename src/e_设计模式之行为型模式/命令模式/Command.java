package e_设计模式之行为型模式.命令模式;

public abstract class Command {
	// 电视机对象, 用于执行电视机的open等
	protected VideoPlayer videoPlayer;
	public Command (VideoPlayer videoPlayer) {
		this.videoPlayer = videoPlayer;
	}

	/**
	 * 执行命令
	 */
	abstract void executeCommand ();
}
