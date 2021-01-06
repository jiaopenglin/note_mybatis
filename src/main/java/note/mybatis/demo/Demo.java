package note.mybatis.demo;

import java.io.IOException;
import java.io.InputStream;

import note.mybatis.mapper.UserMapper;
import note.mybatis.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.type.TypeHandlerRegistry;

public class Demo {

	public static void main(String[] args) {
		try {
			String resource = "SqlMapConfig1.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession openSession = sqlSessionFactory.openSession();
			UserMapper userMapper = openSession.getMapper(UserMapper.class);
			User user = userMapper.queryUserById(1);
			System.out.println(user.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
