package cn.tedu.store.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import cn.tedu.store.entity.User;
import cn.tedu.store.service.ex.DuplicateKeyException;
import cn.tedu.store.service.ex.InsertException;
import cn.tedu.store.service.ex.UpdateException;
import cn.tedu.store.service.ex.UserNotFoundException;


/*处理用户数据的业务层接口*/
public interface IUserService {
	 /**
	    * 学生注册
	    * @param user 用户注册的信息
	    * @return  学生成功注册的用户数据
	    * @throws DuplicateKeyException  字节码异常
	    * @throws InsertException 用户插入异常
	    */
	   User reg(User user) throws DuplicateKeyException,InsertException;
       
	   /**
	    * 查找所有学生信息
	    * @return
	    */
	   List<User> findAll();
	   
	   /**
	    * 查找所有学生成绩信息
	    */
	   List<User> findmarh();
	   
	   /**
	    * 查找个人培训计划
	    */
	   List<User> findplan();
	   
	   /**
	    * 根据学生姓名查找
	    */
	    User findByname(String name);
	    
	    /**
	     * 查寻低于72学时的学生数
	     */
	    List<User> findStime();
	    
	   /**
	    * 修改学生个人资料
	    * @param user 学生数据
	    * @throws UserNotFoundException 学生找不到异常
	    * @throws UpdateException 学生更新未知错误
	    */
	   void updateAll(User user)throws UserNotFoundException,UpdateException;

	


	
}
 