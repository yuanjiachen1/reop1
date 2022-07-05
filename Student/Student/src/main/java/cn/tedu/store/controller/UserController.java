package cn.tedu.store.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.store.entity.User;
import cn.tedu.store.service.IUserService;
import cn.tedu.store.service.ex.UserNotFoundException;
import cn.tedu.store.util.ResponseResult;


@RestController
@RequestMapping("/user")
public class UserController extends BaseController{
    @Autowired
	private IUserService userService;//这里用接口不用类，这是规则
   
    /*设计处理注册的请求
     * 请求路径/user/reg.do
     * 请求方式:POST
     * 请求参数:User
     * 响应数据(成功时)：无*/
       @PostMapping("/reg.do")
       public ResponseResult<Void> handleReg(User user,HttpSession session){
    	 userService.reg(user);
    	 session.setAttribute("username", user.getName());
    	 return new ResponseResult<Void>(SUCCESS);
       }
       
       @GetMapping("/List.do")
       public ResponseResult<List<User>> handleList(User user){
      	List<User> list =userService.findAll();
		return new ResponseResult<List<User>>(SUCCESS,list) ;
       }
       
       @GetMapping("/marh.do")
       public ResponseResult<List<User>> handlemarh(User user){
      	List<User> list =userService.findmarh();
		return new ResponseResult<List<User>>(SUCCESS,list) ;
       }
       
       @GetMapping("/plan.do")
       public ResponseResult<List<User>> handleplan(User user){
      	List<User> list =userService.findplan();
		return new ResponseResult<List<User>>(SUCCESS,list) ;
       }
       
       @GetMapping("/select.do")
       public ResponseResult<List<User>> handleselect(User user){
      	List<User> list =userService.findStime();
		return new ResponseResult<List<User>>(SUCCESS,list) ;
       }
       
       @GetMapping("update.do")
       public ResponseResult<Void> updateAll(
    		   @RequestParam("name") String name,
    		   @RequestParam("gender") String gender,
    		   @RequestParam("nid") String nid,
    		   @RequestParam("company") String company,
    		   @RequestParam("position") String position,
    		   @RequestParam("phone") String phone
    		   ){
    	   try {
    	   User user = userService.findByname(name);
    	   user.setGender(gender);
    	   user.setNid(nid);
    	   user.setCompany(company);
    	   user.setPosition(position);
    	   user.setPhone(phone);
    	   userService.updateAll(user);
    	   }
    	   catch(NullPointerException e){
    		   throw new UserNotFoundException("您访问的学生姓名不存在");
    	   }
    	 
    	   return new ResponseResult<>(SUCCESS);
       }
}