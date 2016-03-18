package com.neusoft.hr.entity;

public class Dept {

	private int did;
	private int deptno;
	private String dname;
	private String dtype;

	public Dept() {
	}

	public Dept(int deptno, String dname, String dtype) {
		super();
		// this.did = did;
		this.deptno = deptno;
		this.dname = dname;
		this.dtype = dtype;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDtype() {
		return dtype;
	}

	public void setDtype(String dtype) {
		this.dtype = dtype;
	}

}
