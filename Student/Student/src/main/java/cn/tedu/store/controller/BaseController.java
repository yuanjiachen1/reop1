package cn.tedu.store.controller;


import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tedu.store.service.ex.DuplicateKeyException;
import cn.tedu.store.service.ex.InsertException;
import cn.tedu.store.service.ex.ServiceException;
import cn.tedu.store.service.ex.UpdateException;
import cn.tedu.store.service.ex.UserNotFoundException;
import cn.tedu.store.util.ResponseResult;

/**
 * 当前项目中所有控制器的基类
 * @author 13269
 *
 */
public class BaseController {
  public static final Integer SUCCESS = 200;
  @ExceptionHandler(ServiceException.class)
  @ResponseBody
  public ResponseResult<Void> handleException(Exception e) {
	  Integer state = null;
	  if(e instanceof DuplicateKeyException) {
		  //400-违反Unique约束的异常
		 state = 400;
	  }else if(e instanceof UserNotFoundException) {
		  //401-用户名不存在
		  state = 401;
	  }else if(e instanceof InsertException) {
		  //500-数据库插入异常
		  state = 500;
	  }else if(e instanceof UpdateException) {
		  //501-跟新数据的异常
		  state = 501;
	  }
	  return  new ResponseResult<>(state,e);
  }
  
  /**
   * 从Session中获取uid
   * @param session HtppSession对象
   * @return 当前登录用户的id
   */
  protected Integer getid(HttpSession session) {
	  return Integer.valueOf(session.getAttribute("id").toString());
   }
}
