package e_设计模式之行为型模式.中介者模式.例子2;

public class OracleDataBase extends AbstractDataBase {
	public OracleDataBase (Mediator mediator) {
		super(mediator);
	}

	public void addData (String value) {
		super.addData(value, "Oracle");
	}
}
