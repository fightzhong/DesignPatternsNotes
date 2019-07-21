package c_设计模式之创建型模式.建造者模式.version2;

public abstract class ComputerBuilder {
	public abstract void buildCPU (String type);
	public abstract void buildDisplayDevice (String type);
	public abstract void buildRAM (String type);
	public abstract void buildGPU (String type);
	public abstract void buildMouse (String type);
	public abstract Computer build ();
}
