package d_设计模式之结构型模式.桥接模式.Test;

public class RegularType implements SaveType {
	@Override
	public String getSaveType () {
		return "定期存款";
	}
}
