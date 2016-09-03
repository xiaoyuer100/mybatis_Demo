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
import com.oraclewdp3.Order;
import com.util.MybatisUtil;

public class junitTest3 {

	/**
	 * 属性名和字段名不同，查询实体类
	 * @throws IOException
	 */
	@Test
	public void testSelect() throws IOException{
		SqlSession sqlSession=MybatisUtil.getSqlSessionFactory();
		String statement="com.oraclewdp3.OrderMapper.selectOneOrder";
		Order order=sqlSession.selectOne(statement,1);
		System.out.println(order);
	}

	@Test
	public void testSelect02() throws IOException{
		SqlSession sqlSession=MybatisUtil.getSqlSessionFactory();
		String statement="com.oraclewdp3.OrderMapper.selectOneOrder02";
		Order order=sqlSession.selectOne(statement,1);
		System.out.println(order);
	}
}
