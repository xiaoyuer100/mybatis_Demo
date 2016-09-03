package test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.oraclewdp.User;
import com.oraclewdp2.UserMapper;
import com.util.MybatisUtil;

public class junitTest2 {

	/**
	 * 注解类型 添加
	 * @throws IOException
	 */
	@Test
	public void testAdd2() throws IOException{
		SqlSession sqlSession=MybatisUtil.getSqlSessionFactory();
		
		UserMapper mapper=sqlSession.getMapper(UserMapper.class);
		int add=mapper.addUser(new User(null,"ss",45));
		System.out.println(add);
		sqlSession.commit();
	}
}
