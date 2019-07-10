package c_设计模式之创建型模式.建造者模式.version2;

public class TestClass {
	public static void main (String[] args) {
		ComputerActualBuilder builder = new ComputerActualBuilder();
		Director director = new Director( builder );
		director.buildComputer( "intel", "液晶显示器", "8G内存", "AMD", "雷蛇" );
		Computer computer = director.getComputer();
		System.out.println( computer );
	}
}
