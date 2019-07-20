package e_设计模式之行为型模式.状态模式;

public interface VideoState {
	void play (VideoPlayer videoPlayer);
	void pause (VideoPlayer videoPlayer);
	void speed (VideoPlayer videoPlayer);
	void stop (VideoPlayer videoPlayer);
}
