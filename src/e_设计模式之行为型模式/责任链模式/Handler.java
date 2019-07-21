package e_设计模式之行为型模式.责任链模式;

public abstract class Handler {
	protected Handler nextHandler;

	public void setNextHandler (Handler handler) {
		this.nextHandler = handler;
	}

	public abstract void handlerAction (String name);
}
