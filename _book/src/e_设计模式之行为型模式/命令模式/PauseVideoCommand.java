package e_设计模式之行为型模式.命令模式;

public class PauseVideoCommand extends Command {
	public PauseVideoCommand (VideoPlayer videoPlayer) {
		super(videoPlayer);
	}

	@Override
	public void executeCommand () {
		videoPlayer.pause();
	}
}
