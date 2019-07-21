package d_设计模式之结构型模式.组合模式;

/**
 * 目录组件接口, 要求文件夹和文件均实现该接口
 */
public abstract class CatalogComponent {
	/**
	 * 获取文件/文件夹的名称
	 * @return
	 */
	public String getName () {
		throw new IllegalArgumentException( "不支持获取名字操作" );
	}

	/**
	 * 获取文件的大小
	 * @return
	 */
	public double getSize () {
		throw new IllegalArgumentException( "不支持获取大小操作" );
	}

	/**
	 * 打印文件的信息
	 */
	public void print () {
		throw new IllegalArgumentException( "不支持打印信息操作" );
	}

	/**
	 * 添加文件
	 * @param catalogComponent
	 */
	public void add (CatalogComponent catalogComponent) {
		throw new IllegalArgumentException( "不支持添加文件操作" );
	}

	/**
	 * 删除文件
	 * @param catalogComponent
	 */
	public void remove (CatalogComponent catalogComponent) {
		throw new IllegalArgumentException( "不支持删除文件操作" );
	}
}
