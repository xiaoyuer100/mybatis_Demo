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
import com.util.MybatisUtil;

public class junitTest4 {

	/**
	 * 属性名和字段名不同，查询实体类
	 * @throws IOException
	 * 一对一 单边  嵌套SQL查询 写两条SQL语句
	 */
	@Test
	public void testSelect() throws IOException{
		SqlSession sqlSession=MybatisUtil.getSqlSessionFactory();
		
		String statement="com.oraclewdp4.ClassesMapper.selectOneClasses";
		Classes classes=sqlSession.selectOne(statement,1);
		System.out.println("classes:"+classes);
		
		Teacher teacher=classes.getTeacher();
		System.out.println("teacher:"+teacher);
	}

	/**
	 * 一对一 单边  嵌套结果查询 一个SQL语句查询出来
	 * @throws IOException
	 */
	
	@Test
	public void testSelect02() throws IOException{
		SqlSession sqlSession=MybatisUtil.getSqlSessionFactory();
		String statement="com.oraclewdp4.ClassesMapper.selectOneClasses2";
		Classes classes=sqlSession.selectOne(statement,1);
		System.out.println(classes.getTeacher());
	}
}
