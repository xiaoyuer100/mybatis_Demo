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
import com.util.MybatisUtil;

public class junitTest5 {

	/**
	 * 属性名和字段名不同，查询实体类
	 * @throws IOException
	 * 一对一 双边  嵌套SQL查询 写两条SQL语句
	 */
	@Test
	public void testSelect() throws IOException{
		SqlSession sqlSession=MybatisUtil.getSqlSessionFactory();

		String statement="com.oraclewdp5.IDCardMapper.selectIdCard";
		IDCard idCard=sqlSession.selectOne(statement,1);
		idCard.getNo();
		//System.out.println(idCard);
		//System.out.println(idCard.getStudent().getIdcard());
	}

}
