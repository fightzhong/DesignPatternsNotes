package d_设计模式之结构型模式.桥接模式.Test;

public class DepositeType implements SaveType {
	@Override
	public String getSaveType () {
		return "活期存款";
	}
}
