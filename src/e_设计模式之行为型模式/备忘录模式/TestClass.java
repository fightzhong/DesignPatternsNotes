package e_设计模式之行为型模式.备忘录模式;

public class TestClass {
	public static void main (String[] args) {
		// 创建一个项目代码
		Coding code = new Coding();

		// 获取一个存档管理者
		CodingMementoManager manager = new CodingMementoManager();

		// 设置当前项目的进度信息
		code.setProjectState( "项目完成30%" );
		code.setCodeLineSize( 1500 );
		System.out.println( code );

		// 保存一次存档
		manager.addMemento( code.savingCodingState() );

		// 设置当前项目的进度信息
		code.setProjectState( "项目完成50%" );
		code.setCodeLineSize( 3000 );
		System.out.println( code );

		// 保存一次存档
		manager.addMemento( code.savingCodingState() );

		// 设置当前项目的进度信息
		code.setProjectState( "项目完成80%" );
		code.setCodeLineSize( 6000 );
		System.out.println( code );

		// 重置代码
		System.out.println( "出现未知错误, 重置到上一次存档, 重新编写本次代码" );
		code.resetCodingState( manager.getCodingMemento() );
		System.out.println( code );

		// 重置代码
		System.out.println( "再一次出现未知错误, 重置到上一次存档, 重新编写本次代码" );
		code.resetCodingState( manager.getCodingMemento() );
		System.out.println( code );
	}
}
