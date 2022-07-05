package cn.tedu.store.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.script.DigestUtils;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonFormat;

import cn.tedu.store.entity.User;
import cn.tedu.store.mapper.UserMapper;
import cn.tedu.store.service.IUserService;
import cn.tedu.store.service.ex.DuplicateKeyException;
import cn.tedu.store.service.ex.InsertException;
import cn.tedu.store.service.ex.UpdateException;
import cn.tedu.store.service.ex.UserNotFoundException;

/*处理用户数据的业务层实现类*/
@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User reg(User user) throws DuplicateKeyException, InsertException {
		//根据尝试注册的用户名查寻用户数据
		User data = findByname(user.getName());
		//判断查寻到的数据是否为null
		if(data == null) {		
			//执行注册
			addnew(user);
			return user;
		}else {
		//否：用户名已经被占用,抛出DuplicateKryException异常
			throw new DuplicateKeyException(" 注册失败,尝试注册的用户名已经被占用");
		}
	}
				
	/**
	 * 查找学生信息
	 */
	 @Override
	 public List<User> findAll() {
	   List<User> users = userMapper.findAll();
	     return users;
	 }
	 /**
	  * 查找学生成绩单
	  */
	@Override
	 public List<User> findmarh() {
		List<User> users = userMapper.findmarh();
		  return users;
		}
	/**
	 * 查找学生培训计划	  
	 */
	@Override
	 public List<User> findplan() {
		List<User> users = userMapper.findplan();
		/*SimpleDateFormat SFDate = new SimpleDateFormat("yy/MM/dd HH:mm");
		  for (User user : users) {
		  SFDate.format(user.getStartime());
		  SFDate.format(user.getEndtime());*/
		return users;
		}
		  
	@Override
	public void updateAll(User user) throws UserNotFoundException, UpdateException {
		//根据user.findbyname()查寻用户数据
				User data = findByname(user.getName());
			  //判断数据是否为null
				if(data == null) {
					//是：抛出：UserNotFoundException
					throw new UserNotFoundException("修改个人资料,您尝试访问的用户名不存在");
				}
				//执行修改:
				updateInfo(user);		
	}
	

	 /**
	   * 根据用户名查寻用户数据
	   * @param username
	   * @return
	   */
	  @Override
	  public User findByname(String name) {
		return userMapper.findByname(name);
	  }
     
	  @Override
	  public List<User> findStime() {
		return userMapper.findStime();
		}     
	  
	/**
	   * 插入学生数据
	   */
	  private void  addnew(User user) {
		Integer rows = userMapper.addnew(user);
		if(rows !=1) {
			throw new InsertException("增加用户数据时出现未知错误！");
		}
	  }
     
	  /**
	   * 更新学生的个人资料
	   * @param user 学生数据
	   */
      private void updateInfo(User user) {
    	//执行更新,获取返回值
    	  Integer rows = userMapper.updateAll(user);
    	  if(rows != 1) {
    		  throw new UpdateException("更新用户数据时出现未知错误！");
    	  }
    	//判断返回值,出错时抛出"更新时的未知错误"
      }



	



}
