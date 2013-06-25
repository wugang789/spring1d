package com.icss.common;

import java.util.Calendar;
import java.util.Locale;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

import com.icss.entity.User;

public class SpringDemo  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		BeanWrapper b;
		ApplicationContext bf = new FileSystemXmlApplicationContext("applicationContext.xml");
//		User user = new User();
//		user.setUserName("zhangsan");
		/*User user = (User) bf.getBean("user");//ioc,di
		System.out.println("user=" + user.getUserName());
		System.out.println("date=" + user.getDate());
		
		String[] strs = user.getStrs();
		Properties props = user.getProps();*/
//		Locale l ;
//		Calendar c;
		BasicDataSource ds = (BasicDataSource)bf.getBean("dataSource");
		Object[] arg = new Object[]{
				"zhangsan",Calendar.getInstance().getTime()
		};
		String userinfo = bf.getMessage("userinfo", arg, Locale.UK);
		System.out.println(userinfo);
		
		Resource rs = bf.getResource("classpath:messages_en_US.properties");
		
	}

}
