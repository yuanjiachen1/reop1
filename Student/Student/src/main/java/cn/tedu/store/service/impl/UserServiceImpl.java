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

/*�����û����ݵ�ҵ���ʵ����*/
@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User reg(User user) throws DuplicateKeyException, InsertException {
		//���ݳ���ע����û�����Ѱ�û�����
		User data = findByname(user.getName());
		//�жϲ�Ѱ���������Ƿ�Ϊnull
		if(data == null) {		
			//ִ��ע��
			addnew(user);
			return user;
		}else {
		//���û����Ѿ���ռ��,�׳�DuplicateKryException�쳣
			throw new DuplicateKeyException(" ע��ʧ��,����ע����û����Ѿ���ռ��");
		}
	}
				
	/**
	 * ����ѧ����Ϣ
	 */
	 @Override
	 public List<User> findAll() {
	   List<User> users = userMapper.findAll();
	     return users;
	 }
	 /**
	  * ����ѧ���ɼ���
	  */
	@Override
	 public List<User> findmarh() {
		List<User> users = userMapper.findmarh();
		  return users;
		}
	/**
	 * ����ѧ����ѵ�ƻ�	  
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
		//����user.findbyname()��Ѱ�û�����
				User data = findByname(user.getName());
			  //�ж������Ƿ�Ϊnull
				if(data == null) {
					//�ǣ��׳���UserNotFoundException
					throw new UserNotFoundException("�޸ĸ�������,�����Է��ʵ��û���������");
				}
				//ִ���޸�:
				updateInfo(user);		
	}
	

	 /**
	   * �����û�����Ѱ�û�����
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
	   * ����ѧ������
	   */
	  private void  addnew(User user) {
		Integer rows = userMapper.addnew(user);
		if(rows !=1) {
			throw new InsertException("�����û�����ʱ����δ֪����");
		}
	  }
     
	  /**
	   * ����ѧ���ĸ�������
	   * @param user ѧ������
	   */
      private void updateInfo(User user) {
    	//ִ�и���,��ȡ����ֵ
    	  Integer rows = userMapper.updateAll(user);
    	  if(rows != 1) {
    		  throw new UpdateException("�����û�����ʱ����δ֪����");
    	  }
    	//�жϷ���ֵ,����ʱ�׳�"����ʱ��δ֪����"
      }



	



}
