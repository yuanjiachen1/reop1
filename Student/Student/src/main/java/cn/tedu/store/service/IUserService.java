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


/*�����û����ݵ�ҵ���ӿ�*/
public interface IUserService {
	 /**
	    * ѧ��ע��
	    * @param user �û�ע�����Ϣ
	    * @return  ѧ���ɹ�ע����û�����
	    * @throws DuplicateKeyException  �ֽ����쳣
	    * @throws InsertException �û������쳣
	    */
	   User reg(User user) throws DuplicateKeyException,InsertException;
       
	   /**
	    * ��������ѧ����Ϣ
	    * @return
	    */
	   List<User> findAll();
	   
	   /**
	    * ��������ѧ���ɼ���Ϣ
	    */
	   List<User> findmarh();
	   
	   /**
	    * ���Ҹ�����ѵ�ƻ�
	    */
	   List<User> findplan();
	   
	   /**
	    * ����ѧ����������
	    */
	    User findByname(String name);
	    
	    /**
	     * ��Ѱ����72ѧʱ��ѧ����
	     */
	    List<User> findStime();
	    
	   /**
	    * �޸�ѧ����������
	    * @param user ѧ������
	    * @throws UserNotFoundException ѧ���Ҳ����쳣
	    * @throws UpdateException ѧ������δ֪����
	    */
	   void updateAll(User user)throws UserNotFoundException,UpdateException;

	


	
}
 