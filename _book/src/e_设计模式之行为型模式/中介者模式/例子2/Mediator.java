package e_设计模式之行为型模式.中介者模式.例子2;

public class Mediator {
	private MysqlDataBase mysqlDataBase;
	private OracleDataBase oracleDataBase;
	private RedisDataBase redisDataBase;

	public void setMysqlDataBase (MysqlDataBase mysqlDataBase) {
		this.mysqlDataBase = mysqlDataBase;
	}

	public void setOracleDataBase (OracleDataBase oracleDataBase) {
		this.oracleDataBase = oracleDataBase;
	}

	public void setRedisDataBase (RedisDataBase redisDataBase) {
		this.redisDataBase = redisDataBase;
	}

	public void sync (String value, String dataBaseType) {
		if ( dataBaseType.equals( "Mysql" ) ) {
			oracleDataBase.getDatabase().add( value );
			redisDataBase.getDatabase().add( value );
		} else if ( dataBaseType.equals( "Oracle" ) ) {
			mysqlDataBase.getDatabase().add( value );
		} else if ( dataBaseType.equals( "Redis" ) ) {
			// 不同步
		}
	}
}
