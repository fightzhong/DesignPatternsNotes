package d_设计模式之结构型模式.桥接模式.Test;

public class ICBCBank extends Bank {

	public ICBCBank (SaveType saveType) {
		super(saveType);
	}

	@Override
	public void printDescription () {
		System.out.println( "中国工商银行之" + saveType.getSaveType() );
	}
}
