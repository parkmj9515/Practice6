package com.javaex.ex04;

public class Employee extends User {
	//	필드
	private int salary;
	//	기본 생성자
	public Employee() {
		
	}
	//	id password name salary
	public Employee(String id,String password,String name,int salary) {
		//	부모 먼저 초기화
		super(id,password,name);
		this.salary=salary;
	}

	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public void showInfo() {
		System.out.println("#아이디:"+getId()+", #패스워드:"+getpassword()+", #이름:"+getName()+"#, 월급:"+salary);
	}
	
}
