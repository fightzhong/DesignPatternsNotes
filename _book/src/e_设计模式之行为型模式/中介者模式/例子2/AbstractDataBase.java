package e_设计模式之行为型模式.中介者模式.例子2;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDataBase {
	private List<String> database = new ArrayList<>();
	private Mediator mediator;

	public AbstractDataBase (Mediator mediator) {
		this.mediator = mediator;
	}

	// 子类实现该添加操作, 然后调用父类的addData来进行数据类型设置
	abstract void addData (String value);

	public void addData (String value, String dataBaseType) {
		database.add( value );
		mediator.sync( value, dataBaseType );
	};

	public List<String> getDatabase () {
		return database;
	}
}
