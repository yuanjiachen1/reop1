package cn.tedu.store.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.tedu.store.entity.User;


/*�����û����ݵĳ־ò�*/
@Mapper
public interface UserMapper {
  
	/**
	   * �����û�����
	   * @param �û�����
	   * @return ��Ӱ�������
	   */
	  
	  Integer addnew(User user);
	  
      /**
       * ͨ���û��������û���Ϣ
       * @param name
       * @return
       */
	  User findByname(String name);
	  
	  /**
	   * �ҳ�����ѧ������Ϣ
	   * @param 
	   * @return
	   */
	  List<User> findAll();
	  
	  /**
	   * �ҳ�����ѧԱ�ɼ���Ϣ
	   * @return
	   */
	  List<User> findmarh();
	  
	  /**
	   * ������ѵ�ƻ�
	   * @return
	   */
	  List<User> findplan();
	  
	  /**
	   * �޸��û�����(�����û���,������ͷ��)
	   * @param user �û�����
	   * @return ��Ӱ�������
	   */
	  Integer updateAll(User user);
	  
	  /**
	   * �ҳ�ѧʱ����72��ѧ��
	   */
	  List<User> findStime();
}
