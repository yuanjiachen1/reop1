package cn.tedu.store.mapper;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTestCase {
	
 @Autowired
 private UserMapper userMapper;
 //http://localhost:8080/user/password.do?old_password=123456&new_password=root
 @Test
 public void addnew() {
	 Date now = new Date();
	 User user = new User();
	 user.setName("root1");
	 user.setGender("root");
	 user.setNid("1231232131");
	 user.setCompany("wew");
	 user.setPosition("ewewe");
	 user.setPhone("312424241");
	 user.setCname("ewew");
	 user.setStudytime("ew");
	 user.setTeacher("ewew");
	 user.setAchievement(132);
	 user.setClasshours(23);
	 user.setPcourse("ewewe");
	 user.setStartime(now);
	 user.setEndtime(now);
	 Integer rows = userMapper.addnew(user);
	 System.err.println("rows="+rows);
 }
 
@Test 
public void findByname() {
	 String name = "小刚 ";
	 User user = userMapper.findByname(name);
	 System.err.println(user);
}

@Test 
public void findAll() {
	List<User> users = userMapper.findAll();
	for(User user: users) {
		  System.out.println(user);
	  }
}

@Test 
public void findmarh() {
  List<User> users = userMapper.findmarh();
	for(User user: users) {
       System.out.println(user);
	  }	
}

@Test 
public void findStime() {
  List<User> users = userMapper.findStime();
	for(User user: users) {
       System.out.println(user);
	  }	
}

@Test 
public void findplan() {
  List<User> users = userMapper.findplan();
	for(User user: users) {
	   System.out.println(user);
		  }			
 }

@Test
public void updateAll() {
	User user = new User();
	user.setId(14);
	user.setGender("女");
	user.setNid("512456988874154582");
	user.setCompany("无锡学院");
	user.setPosition("学生");
	user.setPhone("13773716139");
	Integer rows = userMapper.updateAll(user);
	System.err.println("rows" + rows);
}


}
