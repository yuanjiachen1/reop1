package cn.tedu.store.service;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.User;
import cn.tedu.store.service.ex.ServiceException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTestCase {
	@Autowired
	private IUserService userService;
    
	@Test
	public void reg() {
		try {
			 Date now = new Date();
			 User user = new User();
			 user.setName("root");
			 user.setGender("root1");
			 user.setNid("12312321311");
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
			User result = userService.reg(user);
			System.err.println("result=" + result);
		} catch (ServiceException e) {
			System.err.println("错误类型" + e.getClass().getName());
			System.err.println("错误描述" + e.getMessage());
		}
	}
	@Test
	public void findByname() {
	  List<User> users = userService.findAll();
	  for(User user: users) {
		  System.out.println(user);
	  }
	}
	
	@Test
	public void findAll() {
	  List<User> users = userService.findAll();
	  for(User user: users) {
		  System.out.println(user);
	  }
	}
	
	@Test
	public void findmarh() {
	  List<User> users = userService.findmarh();
	  for(User user: users) {
		  System.out.println(user);
	  }
	}
	
	@Test
	public void findplan() {
	  List<User> users = userService.findplan();
	  for(User user: users) {
		  System.out.println(user);
	  }
	}
	
	@Test
	public void updateAll() {
		try {
		User user = new User();
		user.setId(14);
		user.setName("小莉");
		user.setNid("512456982354154582");
		user.setCompany("无锡学院");
		user.setPosition("老师");
		user.setPhone("13883716139");
		userService.updateAll(user);
		System.err.println("ok");
		}catch (ServiceException e) {
			System.err.println("错误类型" + e.getClass().getName());
			System.err.println("错误描述" + e.getMessage());
		}
	}
}
