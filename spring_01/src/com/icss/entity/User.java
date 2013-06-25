package com.icss.entity;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class User {

	private String userName;
	
	private Date date;
	
	private String[] strs;
	
	private List list;
	
	private Map map;
	
	private Properties props;

	public String[] getStrs() {
		return strs;
	}

	public void setStrs(String[] strs) {
		this.strs = strs;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {//di
		this.userName = userName;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}
}
