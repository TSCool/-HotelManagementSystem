package hotel.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class GetSession {
	public static SqlSessionFactory factory;
	static {
		factory = new SqlSessionFactoryBuilder()
				.build(GetSession.class.getClassLoader().getResourceAsStream("mybatis.xml"));
	}
	public static SqlSession getsqlsession(boolean autoCommit) {
		return factory.openSession(autoCommit);
	}
}
