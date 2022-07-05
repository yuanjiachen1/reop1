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
 * ��ǰ��Ŀ�����п������Ļ���
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
		  //400-Υ��UniqueԼ�����쳣
		 state = 400;
	  }else if(e instanceof UserNotFoundException) {
		  //401-�û���������
		  state = 401;
	  }else if(e instanceof InsertException) {
		  //500-���ݿ�����쳣
		  state = 500;
	  }else if(e instanceof UpdateException) {
		  //501-�������ݵ��쳣
		  state = 501;
	  }
	  return  new ResponseResult<>(state,e);
  }
  
  /**
   * ��Session�л�ȡuid
   * @param session HtppSession����
   * @return ��ǰ��¼�û���id
   */
  protected Integer getid(HttpSession session) {
	  return Integer.valueOf(session.getAttribute("id").toString());
   }
}
