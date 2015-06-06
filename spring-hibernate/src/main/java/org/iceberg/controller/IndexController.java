package org.iceberg.controller;

import org.iceberg.dao.UserDao;
import org.iceberg.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("index")
	public String index(){
		return "index";
	}
	
	@RequestMapping("saveUser/{id}/{name}")
	@ResponseBody
	public String saveUser(@PathVariable String id,@PathVariable String name){
		User user = new User();
		user.setUserName(name);
		user.setId(id);
		userDao.save(user);
		return "ok";
	}
}
