package com.neusoft.hr.factory;

import com.neusoft.hr.dao.DeptDAO;
import com.neusoft.hr.impl.DeptDAOImpl;

public class DeptDAOFactory {

	//���ݲ��ṩ mysqlʵ�֡�
	public static DeptDAO getDeptInstance(){
		return new DeptDAOImpl();
	}
	
	//oralce ʵ�֡�
	
}
