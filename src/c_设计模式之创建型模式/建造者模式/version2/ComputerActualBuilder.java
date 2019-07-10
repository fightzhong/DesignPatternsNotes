package c_设计模式之创建型模式.建造者模式.version2;

public class ComputerActualBuilder extends ComputerBuilder {
	Computer computer = new Computer();

	@Override
	public void buildCPU (String type) {
		computer.setCpu( type );
	}

	@Override
	public void buildDisplayDevice (String type) {
		computer.setDisplayDevice( type );
	}

	@Override
	public void buildRAM (String type) {
		computer.setRam( type );
	}

	@Override
	public void buildGPU (String type) {
		computer.setGpu( type );
	}

	@Override
	public void buildMouse (String type) {
		computer.setMouse( type );
	}

	@Override
	public Computer build () {
		return computer;
	}
}
