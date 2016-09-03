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
import com.oraclewdp4.Classes;
import com.oraclewdp4.Teacher;
import com.oraclewdp5.IDCard;
import com.oraclewdp6.Person;
import com.util.MybatisUtil;

public class junitTest6 {

	/**
	 * 属性名和字段名不同，查询实体类
	 * @throws IOException
	 * 一对多  通过<collection property="" column="" 
	 *			select=""></collection>实现
	 */
	@Test
	public void testSelect() throws IOException{
		SqlSession sqlSession=MybatisUtil.getSqlSessionFactory();
		
		String statement="com.oraclewdp6.PersionMapper.selectOnePerson";
		Person person=sqlSession.selectOne(statement,1);
		System.out.println(person);
		System.out.println(person.getCars());
	}

}
