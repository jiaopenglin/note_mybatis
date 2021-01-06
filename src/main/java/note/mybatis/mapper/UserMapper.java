package note.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

import note.mybatis.model.User;

import java.util.List;

public interface UserMapper {
	 public void addUser(User user);
	 public int insertList(List list);
	 public User queryUserById(@Param("id") int id);
	 public void updateUser(User user);
}
