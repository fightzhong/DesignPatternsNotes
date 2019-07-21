package d_设计模式之结构型模式.组合模式;

public class TestClass {
	public static void main (String[] args) {
		// 创建四个文件
		CatalogComponent f1 = new File( "文件1", 500 );
		CatalogComponent f2 = new File( "文件2", 600 );
		CatalogComponent f3 = new File( "文件3", 700 );
		CatalogComponent f4 = new File( "文件4", 800 );

		// 创建文件夹
		Folder mainFolder = new Folder( "主文件夹" );
		Folder folder = new Folder( "次文件夹" );

		// 将文件1和次文件夹放入主文件夹
		mainFolder.add( f1 );
		mainFolder.add( folder );

		// 将剩余的文件放入次文件夹
		folder.add( f2 );
		folder.add( f3 );
		folder.add( f4 );

		// 调用主文件夹的print方法
		mainFolder.print();
	}
}
