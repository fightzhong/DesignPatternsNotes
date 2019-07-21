package e_设计模式之行为型模式.命令模式;

public class StopVideoCommand extends Command {
	public StopVideoCommand (VideoPlayer videoPlayer) {
		super(videoPlayer);
	}

	@Override
	public void executeCommand () {
		videoPlayer.stop();
	}
}
