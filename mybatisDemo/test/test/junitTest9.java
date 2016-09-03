package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.oraclewdp.User;
import com.oraclewdp2.UserMapper;
import com.util.MybatisUtil;

public class junitTest9 {

	/**
	 * 添加用户
	 * @throws IOException
	 */
	@Test
	public void testProcedure() throws IOException{
		SqlSession sqlSession=MybatisUtil.getSqlSessionFactory();
		
		Map<String, Object> paramMap=new HashMap<String,Object>();
		paramMap.put("name", "%小%");
		paramMap.put("num", -1);
		
		sqlSession.selectOne("com.oraclewdp9.PUserMapper.getUserCount",paramMap);
		System.out.println(paramMap.get("num"));
	}
	
	/**
	 * 修改用户
	 * @throws IOException
	 */
	@Test
	public void testUpdate() throws IOException{
		SqlSession sqlSession=MybatisUtil.getSqlSessionFactory();
		
		User user=new User(1,"余敦刚1",23);
		String statement="com.oraclewdp.UserMapper.updateUser";
		sqlSession.update(statement,user);
		sqlSession.commit();
	}
	
	/**
	 * 删除用户
	 * @throws IOException
	 */
	@Test
	public void testDelete() throws IOException{
		SqlSession sqlSession=MybatisUtil.getSqlSessionFactory();
		
		String statement="com.oraclewdp.UserMapper.deleteUser";
		sqlSession.delete(statement,2);
		sqlSession.commit();
	}
}
