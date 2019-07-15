package d_设计模式之结构型模式.桥接模式.Test;

public class ABCBank extends Bank {

	public ABCBank (SaveType saveType) {
		super(saveType);
	}

	@Override
	public void printDescription () {
		System.out.println( "中国农业银行之" + saveType.getSaveType() );
	}
}
