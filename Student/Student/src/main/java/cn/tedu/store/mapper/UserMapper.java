package cn.tedu.store.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.tedu.store.entity.User;


/*处理用户数据的持久层*/
@Mapper
public interface UserMapper {
  
	/**
	   * 插入用户数据
	   * @param 用户数据
	   * @return 受影响的行数
	   */
	  
	  Integer addnew(User user);
	  
      /**
       * 通过用户名查找用户信息
       * @param name
       * @return
       */
	  User findByname(String name);
	  
	  /**
	   * 找出所有学生的信息
	   * @param 
	   * @return
	   */
	  List<User> findAll();
	  
	  /**
	   * 找出所有学员成绩信息
	   * @return
	   */
	  List<User> findmarh();
	  
	  /**
	   * 个人培训计划
	   * @return
	   */
	  List<User> findplan();
	  
	  /**
	   * 修改用户资料(不含用户名,密码与头像)
	   * @param user 用户资料
	   * @return 受影响的行数
	   */
	  Integer updateAll(User user);
	  
	  /**
	   * 找出学时低于72的学生
	   */
	  List<User> findStime();
}
