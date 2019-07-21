package d_设计模式之结构型模式.代理模式.静态代理;

public class DaoImpl implements  IDao {
	@Override
	public int insert () {
		// 这里使用伪代码, 假设往数据库里插入了数据
		System.out.println( "正在操作数据库, 操作成功后返回影响条数为1" );
		return 1;
	}
}
