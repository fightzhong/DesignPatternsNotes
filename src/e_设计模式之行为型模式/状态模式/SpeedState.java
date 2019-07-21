package e_设计模式之行为型模式.状态模式;

public class SpeedState implements VideoState {
	@Override
	public void play (VideoPlayer videoPlayer) {
		System.out.println( "电视机由加速播放状态切换为正常播放状态" );
		videoPlayer.setState( VideoPlayer.PLAY_STATE );
		videoPlayer.play();
	}

	@Override
	public void pause (VideoPlayer videoPlayer) {
		System.out.println( "电视机由加速播放状态切换为停止状态" );
		videoPlayer.setState( VideoPlayer.PAUSE_STATE );
		videoPlayer.pause();
	}

	@Override
	public void speed (VideoPlayer videoPlayer) {
		System.out.println( "电视机正在处于加速播放状态" );
	}

	@Override
	public void stop (VideoPlayer videoPlayer) {
		System.out.println( "电视机由加速播放状态切换为停止状态" );
		videoPlayer.setState( VideoPlayer.STOP_STATE );
		videoPlayer.stop();
	}
}
