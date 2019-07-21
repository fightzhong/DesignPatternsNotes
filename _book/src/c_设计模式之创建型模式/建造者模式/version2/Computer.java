package c_设计模式之创建型模式.建造者模式.version2;

public class Computer {
	/**依次是CPU, 显示器, 内存, 显卡, 鼠标 */
	private String cpu;
	private String displayDevice;
	private String ram;
	private String gpu;
	private String mouse;

	public String getCpu () {
		return cpu;
	}

	public void setCpu (String cpu) {
		this.cpu = cpu;
	}

	public String getDisplayDevice () {
		return displayDevice;
	}

	public void setDisplayDevice (String displayDevice) {
		this.displayDevice = displayDevice;
	}

	public String getRam () {
		return ram;
	}

	public void setRam (String ram) {
		this.ram = ram;
	}

	public String getGpu () {
		return gpu;
	}

	public void setGpu (String gpu) {
		this.gpu = gpu;
	}

	public String getMouse () {
		return mouse;
	}

	public void setMouse (String mouse) {
		this.mouse = mouse;
	}

	@Override
	public String toString () {
		return "Computer{" +
		"cpu='" + cpu + '\'' +
		", displayDevice='" + displayDevice + '\'' +
		", ram='" + ram + '\'' +
		", gpu='" + gpu + '\'' +
		", mouse='" + mouse + '\'' +
		'}';
	}
}
