package d_设计模式之结构型模式.桥接模式.Test;

public class TestClass {
	public static void main (String[] args) {
	    RegularType type = new RegularType();
	    ICBCBank icbc = new ICBCBank( type );
	    icbc.printDescription();


	}
}
