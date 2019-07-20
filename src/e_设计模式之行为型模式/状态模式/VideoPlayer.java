package e_设计模式之行为型模式.状态模式;

public class VideoPlayer {
	// 当前电视机的状态
	private VideoState state;

	// 假设电视机一共四种状态, 我们可以只创建一次这四种状态
	public static final VideoState PLAY_STATE = new PlayState();
	public static final VideoState PAUSE_STATE = new PauseState();
	public static final VideoState SPEED_STATE = new SpeedState();
	public static final VideoState STOP_STATE = new StopState();

	/**
	 * 获取电视机的状态
	 * @return
	 */
	public VideoState getState () {
		return state;
	}

	/**
	 * 设置电视机的状态
	 * @param state
	 */
	public void setState (VideoState state) {
		this.state = state;
	}

	/**
	 * 调用电视机的播放功能
	 */
	public void play () {
		state.play( this );
	}

	public void pause () {
		state.pause( this );
	}

	public void speed () {
		state.speed( this );
	}

	public void stop () {
		state.stop( this );
	}
}
