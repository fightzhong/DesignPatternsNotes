package e_设计模式之行为型模式.观察者模式;

import java.util.ArrayList;

public abstract class AbstractFuErDai {
	protected String name;                     // 富二代的名字
	protected ArrayList<GrilFriend> observers = new ArrayList<>(); // 观察者(富二代的所有女朋友)

	public AbstractFuErDai (String name) {
		this.name = name;
	}

	/**
	 * 添加一个女朋友
	 * @param grilFriend
	 */
	public abstract void attachGrilFriend (GrilFriend grilFriend);

	/**
	 * 删除一个女朋友
	 * @param grilFriend
	 * @return
	 */
	public abstract void detachGrilFriend (GrilFriend grilFriend);

	/**
	 * 通知所有的女朋友, 即状态的改变
	 */
	public abstract void notifyAllGrilFriend (String message);
}
