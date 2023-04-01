package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.bean.UserBean;
import com.dao.UserDao;
//server --> start --> stop 
public class ServerEventListener implements ServletContextListener {

	
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Server Listener -> contextInit ");
		
		UserDao userDao = new UserDao();
		
		UserBean user1 = new UserBean();
		user1.setUserId(100);
		user1.setFirstName("ram");
		user1.setEmail("ram@sita.com");
		user1.setPassword("hanuman");
		user1.setRole(1);
		userDao.addUser(user1);


		UserBean user2 = new UserBean();
		user2.setUserId(200);
		user2.setFirstName("sita");
		user2.setEmail("stia@ram.com");
		user2.setPassword("vibhishan");
		user2.setRole(1);
		userDao.addUser(user2);


		UserBean user3 = new UserBean();
		user3.setUserId(300);
		user3.setFirstName("balram");
		user3.setEmail("balram@krishna.com");
		user3.setPassword("krishna");
		user3.setRole(2);
		userDao.addUser(user3);

		
	}
	
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("Server Listener -> contextDestroyed ");
	}
}
