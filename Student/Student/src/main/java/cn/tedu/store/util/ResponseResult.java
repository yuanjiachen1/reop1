package cn.tedu.store.util;

import java.io.Serializable;
/**
 * ����������ͻ�����Ӧ���������
 *
 * @param <E> ����������ͻ�����Ӧ����������
 */
public class ResponseResult<E> implements Serializable{
	
	private static final long serialVersionUID = -1626793180717240861L;
	
  private Integer state;
  private String message;
  private E data;

  public ResponseResult() {
		super();
	}
  public ResponseResult(Integer state) {
		super();
		setState(state);
	}    
  
public ResponseResult(Integer state, String message) {
	this(state);//����ָ���ñ���Ĺ��췽��Ҳ����ResponseResult(Integer state)
	setMessage(message);
}

public ResponseResult(Integer state, Exception e) {	
	this(state,e.getMessage());

}

public ResponseResult(Integer state, E data) {
	this(state);
	setData(data);
}



public Integer getState() {
	return state;
}
public void setState(Integer state) {
	this.state = state;
}
public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
public E getData() {
	return data;
}

public void setData(E data) {
	this.data = data;
}

@Override
public String toString() {
	return "ResponseResult [state=" + state + ", message=" + message + ", data=" + data + "]";
}

//�޲ι��췽��
//���췽��(int state):��ʾ�����ɹ�ʱq
//���췽��(int state,String message)��ʾ����ʧ��(��������)
//���췽��(int state,Exception e) ��ʾ����ʧ��(�쳣��������)
//���췽��(int state��T data):��ʾ�û��������ݳɹ���




}
