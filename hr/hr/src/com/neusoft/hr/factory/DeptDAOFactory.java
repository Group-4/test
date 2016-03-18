package com.neusoft.hr.factory;

import com.neusoft.hr.dao.DeptDAO;
import com.neusoft.hr.impl.DeptDAOImpl;

public class DeptDAOFactory {

	//数据层提供 mysql实现。
	public static DeptDAO getDeptInstance(){
		return new DeptDAOImpl();
	}
	
	//oralce 实现。
	
}
