package cn.tedu.store.util;

import java.io.Serializable;
/**
 * 服务器端向客户端响应结果的类型
 *
 * @param <E> 服务器端向客户端响应的数据类型
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
	this(state);//这里指调用本身的构造方法也就是ResponseResult(Integer state)
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

//无参构造方法
//构造方法(int state):表示操作成功时q
//构造方法(int state,String message)表示操作失败(错误描述)
//构造方法(int state,Exception e) 表示操作失败(异常错误描述)
//构造方法(int state，T data):表示用户请求数据成功后




}
