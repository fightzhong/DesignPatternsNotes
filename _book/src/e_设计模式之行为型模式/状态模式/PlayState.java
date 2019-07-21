package e_设计模式之行为型模式.状态模式;

public class PlayState implements VideoState {
	@Override
	public void play (VideoPlayer videoPlayer) {
		System.out.println( "电视机正处于播放状态" );
	}

	@Override
	public void pause (VideoPlayer videoPlayer) {
		System.out.println( "电视机由播放状态切换为暂停状态" );
		videoPlayer.setState( VideoPlayer.PAUSE_STATE );
		videoPlayer.pause();
	}

	@Override
	public void speed (VideoPlayer videoPlayer) {
		System.out.println( "电视机由播放状态切换为快速播放状态" );
		videoPlayer.setState( VideoPlayer.SPEED_STATE );
		videoPlayer.speed();
	}

	@Override
	public void stop (VideoPlayer videoPlayer) {
		System.out.println( "电视机由播放状态切换为停止播放状态" );
		videoPlayer.setState( VideoPlayer.STOP_STATE );
		videoPlayer.stop();
	}
}
