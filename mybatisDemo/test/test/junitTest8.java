package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.oraclewdp7.Group;
import com.util.MybatisUtil;

public class junitTest8 {

	/**
	 * ¶¯Ì¬SQLÓï¾ä  IF
	 * @author YDG
	 * @throws IOException
	 */
	@Test
	public void testIF() throws IOException{
		SqlSession sqlSession=MybatisUtil.getSqlSessionFactory();
		
		Map<String, Integer> paramMap=new HashMap<String,Integer>();
		paramMap.put("price", 20);
		
		String statement="com.oraclewdp8.OrderMapperDynamicSQL.selectOrderIf";
		Order order=sqlSession.selectOne(statement,paramMap);
		System.out.println(order);
	}
	
	/**
	 * ¶¯Ì¬SQLÓï¾ä Choose
	 * @throws IOException
	 */
	@Test
	public void testChoose() throws IOException{
		SqlSession sqlSession=MybatisUtil.getSqlSessionFactory();
		
		Map<String, Integer> paramMap=new HashMap<String,Integer>();
		paramMap.put("price", 20);
		paramMap.put("no", 1002121);
		
		String statement="com.oraclewdp8.OrderMapperDynamicSQL.selectOrderChoose";
		Order order=sqlSession.selectOne(statement,paramMap);
		System.out.println(order);
	}
	
	/**
	 * ¶¯Ì¬SQLÓï¾ä where
	 * @throws IOException
	 */
	@Test
	public void testWhere() throws IOException{
		SqlSession sqlSession=MybatisUtil.getSqlSessionFactory();
		
		Map<String, Integer> paramMap=new HashMap<String,Integer>();
		paramMap.put("price", 20);
		
		String statement="com.oraclewdp8.OrderMapperDynamicSQL.selectOrderWhere";
		Order order=sqlSession.selectOne(statement,paramMap);
		System.out.println(order);
	}
	
	/**
	 * ¶¯Ì¬SQLÓï¾ä trim
	 * @throws IOException
	 */
	@Test
	public void testTrim() throws IOException{
		SqlSession sqlSession=MybatisUtil.getSqlSessionFactory();
		
		Map<String, Integer> paramMap=new HashMap<String,Integer>();
		paramMap.put("price", 20);
		
		String statement="com.oraclewdp8.OrderMapperDynamicSQL.selectOrderWhere";
		Order order=sqlSession.selectOne(statement,paramMap);
		System.out.println(order);
	}
	
	/**
	 * ¶¯Ì¬SQLÓï¾ä set
	 * @throws IOException
	 */
	@Test
	public void testSet() throws IOException{
		SqlSession sqlSession=MybatisUtil.getSqlSessionFactory();
		
		Map<String, Integer> paramMap=new HashMap<String,Integer>();
		paramMap.put("price", 26);
		paramMap.put("id", 1);
		
		String statement="com.oraclewdp8.OrderMapperDynamicSQL.updateOrderSet";
		sqlSession.update(statement,paramMap);
		sqlSession.commit();
	}
	
	/**
	 * ¶¯Ì¬SQLÓï¾ä foreach
	 * @throws IOException
	 */
	@Test
	public void testForeach() throws IOException{
		SqlSession sqlSession=MybatisUtil.getSqlSessionFactory();
		
		List<Integer> orderIdList=new ArrayList<Integer>();
		orderIdList.add(1000);
		orderIdList.add(1);
		orderIdList.add(2);
		
		String statement="com.oraclewdp8.OrderMapperDynamicSQL.selectOrderForeach";
		Order order=sqlSession.selectOne(statement,orderIdList);
		System.out.println(order);
	}
	
	/**
	 * ¶¯Ì¬SQLÓï¾ä include
	 * @throws IOException
	 */
	@Test
	public void testInclude() throws IOException{
		SqlSession sqlSession=MybatisUtil.getSqlSessionFactory();
		
		String statement="com.oraclewdp8.OrderMapperDynamicSQL.selectOrderInclude";
		Order order=sqlSession.selectOne(statement,1);
		System.out.println(order);
	}
}
