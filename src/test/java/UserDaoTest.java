import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import note.mybatis.mapper.UserMapper;
import note.mybatis.model.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class UserDaoTest {

	@Autowired
	public UserMapper userMapper;
    @Test
    public void addUser() throws Exception {
    	User user = new User();
    	user.setAddress("北京");
    	user.setAge(20);
    	user.setName("jack");
    	//user.setUserId(1);
    	userMapper.addUser(user);
    }
    @Test
    public void queryUser() throws Exception {
    	
    	User queryUserById = userMapper.queryUserById(1);
    	System.out.println(queryUserById);
    	
    	
    }
    @Test
    public void updateUser() throws Exception {
		User user = new User();
		//user.setAddress("北京");
		user.setAge(20);
		user.setName("jackedit11");
		user.setUserId(1);
    	userMapper.updateUser(user);


    }

	@Test
	public void insertList() throws Exception {
    	List<User>  list =new ArrayList<User>();
		User user = new User();
		user.setAddress("北京");
		user.setAge(20);
		user.setName("jack");
		list.add(user);
		User user1 = new User();
		user1.setAddress("上海普陀区");
		user1.setAge(22);
		user1.setName("jackma");
		list.add(user1);
		int i = userMapper.insertList(list);
		System.out.println(i);


	}
	
}
