package d_设计模式之结构型模式.代理模式.静态代理;

public class DaoProxy implements IDao {
	private DaoImpl dao;

	public DaoProxy (DaoImpl dao) {
		this.dao = dao;
	}

	@Override
	public int insert () {
		System.out.println( "操作数据库开始" );
		int result = dao.insert();
		System.out.println( "操作数据库结束" );
		return result;
	}
}
