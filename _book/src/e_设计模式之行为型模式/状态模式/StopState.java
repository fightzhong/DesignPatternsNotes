package e_设计模式之行为型模式.状态模式;

public class StopState implements VideoState {
	@Override
	public void play (VideoPlayer videoPlayer) {
		System.out.println( "电视机由停止播放状态切换为正在播放状态" );
		videoPlayer.setState( VideoPlayer.PLAY_STATE );
		videoPlayer.play();
	}

	@Override
	public void pause (VideoPlayer videoPlayer) {
		System.out.println( "停止播放状态不能切换为暂停播放状态" );
	}

	@Override
	public void speed (VideoPlayer videoPlayer) {
		System.out.println( "停止播放状态不能切换为加速播放状态" );
	}

	@Override
	public void stop (VideoPlayer videoPlayer) {
		System.out.println( "电视机正在处于停止播放状态" );
	}
}
