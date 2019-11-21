package com.tedu.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.tedu.dao.DoorMapper;
import com.tedu.pojo.Door;


/* * * * * * * * * * * * * * * * *
 * 测试类：测试mybatis开发环境	 *
 * * * * * * * * * * * * * * * * */
public class TestMybatis {
	@Test
	public void testFindAll() throws Exception {
		// 读取配置文件
		InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
		// 获取SqlSessionFactory对象
		SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(in);
		// 获取SqlSession对象
		SqlSession session = fac.openSession();
		// 获取DoorMapper接口的子类实例
		DoorMapper dao = session.getMapper(DoorMapper.class);
		List<Door> list = dao.findAll();
		for (Door door : list) {
			System.out.println(door);
		}
	}
}
