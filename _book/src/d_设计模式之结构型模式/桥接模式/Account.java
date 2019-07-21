package d_设计模式之结构型模式.桥接模式;

public interface Account {
	/**
	 * 打开账号, 并返回账号
	 * @return
	 */
	public Account openAccount ();

	/**
	 * 显示账号的类型(活期/定期)
	 */
	public void showAccoutType ();
}
