package com.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class UserCounterListener implements HttpSessionListener{

	int userCount = 0;
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		userCount++;
		System.out.println("Total User(+) => "+userCount);
	}
	
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		userCount--;
		System.out.println("Total User(-) => "+userCount);
		
	}
}
