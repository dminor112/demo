package com.dminor.demo.dao;

import java.util.List;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.dminor.demo.model.User;
import com.dminor.demo.service.UserService;

public class TestUserDao {

	    @Test
	    public void test(){
	        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:context/applicationContext.xml");
	        UserService us = (UserService) ac.getBean("userService");
	        List<User> users = us.list();
	        System.out.println(users.size());
	    }
	    
	    @Test
	    public void testAdd(){
	        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:context/applicationContext.xml");
	        UserService us = (UserService) ac.getBean("userService");
	        User  u = new User();
	        u.setAddress("longchuang");
	        u.setAge(12);
	        u.setName("dminor");
	        us.insert(u);
	    }
	    
	    @Test
	    public void testDelete(){
	        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:context/applicationContext.xml");
	        UserService us = (UserService) ac.getBean("userService");
	        us.deleteById("1");
	    }
}
