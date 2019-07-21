package e_设计模式之行为型模式.命令模式;

public class VideoPlayer {
	public void play () {
		System.out.println( "打开电视机看电视" );
	}
	
	public void pause () {
		System.out.println( "暂停电视机播放节目" );
	}
	
	public void stop () {
		System.out.println( "关闭电视机" );
	}
}
