package e_设计模式之行为型模式.中介者模式.例子2;

public class TestClass {
	public static void main (String[] args) {
		// 创建一个中介者
		Mediator mediator = new Mediator();
		// 创建三个数据库
		OracleDataBase oracleDataBase = new OracleDataBase( mediator );
		RedisDataBase redisDataBase = new RedisDataBase( mediator );
		MysqlDataBase mysqlDataBase = new MysqlDataBase( mediator );

		mediator.setMysqlDataBase( mysqlDataBase );
		mediator.setOracleDataBase( oracleDataBase );
		mediator.setRedisDataBase( redisDataBase );

		// 往mysql中添加数据
		mysqlDataBase.addData( "aaa" );
		mysqlDataBase.addData( "bbb" );

		// 往oracle中添加数据
		oracleDataBase.addData( "ccc" );
		oracleDataBase.addData( "ddd" );

		// 往redis中添加数据
		redisDataBase.addData( "eeee" );
	}
}
