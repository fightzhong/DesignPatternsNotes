package d_设计模式之结构型模式.组合模式;

import java.util.ArrayList;
import java.util.List;

public class Folder extends CatalogComponent {
	private String name;
	private List<CatalogComponent> files = new ArrayList<>();

	public Folder (String name) {
		this.name = name;
	}

	@Override
	public String getName () {
		return this.name;
	}

	@Override
	public void print () {
		System.out.println( this.getName() );
		// 遍历files
		for ( CatalogComponent c: files ) {
			c.print();
		}
	}

	/**
	 * 将文件/文件夹添加到files中
	 * @param catalogComponent
	 */
	@Override
	public void add (CatalogComponent catalogComponent) {
		this.files.add( catalogComponent );
	}

	@Override
	public void remove (CatalogComponent catalogComponent) {
		this.files.remove( catalogComponent );
	}
}
