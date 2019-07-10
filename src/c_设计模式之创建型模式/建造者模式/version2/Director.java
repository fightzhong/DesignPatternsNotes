package c_设计模式之创建型模式.建造者模式.version2;

public class Director {
	private ComputerBuilder computerBuilder;

	public Director (ComputerBuilder computerBuilder) {
		this.computerBuilder = computerBuilder;
	}

	public void buildComputer (String cpu, String displayDevice, String ram, String gpu, String mouse) {
		computerBuilder.buildCPU( cpu );
		computerBuilder.buildDisplayDevice( displayDevice );
		computerBuilder.buildRAM( ram );
		computerBuilder.buildGPU( gpu );
		computerBuilder.buildMouse( mouse );
	}

	public Computer getComputer () {
		return computerBuilder.build();
	}
}
