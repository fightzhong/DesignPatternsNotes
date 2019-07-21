package e_设计模式之行为型模式.中介者模式.例子2;

public class RedisDataBase extends AbstractDataBase {
	public RedisDataBase (Mediator mediator) {
		super(mediator);
	}

	public void addData (String value) {
		super.addData(value, "Redis");
	}
}
