package e_设计模式之行为型模式.状态模式;

public class PauseState implements VideoState {
	@Override
	public void play (VideoPlayer videoPlayer) {
		System.out.println( "电视机由暂停状态切换为播放状态" );
		videoPlayer.setState( VideoPlayer.PLAY_STATE );
		videoPlayer.play();
	}

	@Override
	public void pause (VideoPlayer videoPlayer) {
		System.out.println( "电视机正在处于暂停状态" );
	}

	@Override
	public void speed (VideoPlayer videoPlayer) {
		System.out.println( "电视机由暂停状态切换为加速播放状态" );
		videoPlayer.setState( VideoPlayer.SPEED_STATE );
		videoPlayer.speed();
	}

	@Override
	public void stop (VideoPlayer videoPlayer) {
		System.out.println( "电视机由暂停状态切换为停止状态" );
		videoPlayer.setState( VideoPlayer.STOP_STATE );
		videoPlayer.stop();
	}
}
