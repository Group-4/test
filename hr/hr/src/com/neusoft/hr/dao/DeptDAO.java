package com.neusoft.hr.dao;

import java.util.List;

import com.neusoft.hr.entity.Dept;

public interface DeptDAO {

	//1.add dept
	public boolean addDept(Dept d);
	
	//2.upd
	public boolean updDept(Dept d);
	
	//3.del
	public boolean delDept(int did);
	
	//4.sing find
	public Dept findDeptById(int did);
	
	//4,find all.
	public List findAllDept();
	
	//5.find by like
	public List findDeptByLike(String query);
	
	
}
