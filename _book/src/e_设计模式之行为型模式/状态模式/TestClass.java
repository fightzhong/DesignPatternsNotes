package e_设计模式之行为型模式.状态模式;

public class TestClass {
	public static void main (String[] args) {
		// 创建一台电视机
		VideoPlayer videoPlayer = new VideoPlayer();
		videoPlayer.setState( VideoPlayer.PLAY_STATE );
		videoPlayer.play();
		videoPlayer.pause();
		videoPlayer.speed();
		videoPlayer.stop();
		videoPlayer.speed();



	}
}
