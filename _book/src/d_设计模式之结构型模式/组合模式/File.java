package d_设计模式之结构型模式.组合模式;

public class File extends CatalogComponent {
	private String name;
	private int size;

	public File (String name, int size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public String getName () {
		return this.name;
	}

	@Override
	public double getSize () {
		return this.size;
	}

	@Override
	public void print () {
		System.out.println( "文件名: " + name + ", size: " + size );
	}
}
