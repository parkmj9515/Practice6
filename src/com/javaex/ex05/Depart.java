package com.javaex.ex05;

public class Depart extends Employee {

	 //	필드
	private String department;
	
	//	생성자
	public Depart() {
		
	}
	//	name salary department 매개변수 생성자
	public Depart(String name,int salary,String department) {	//이름과 급여는 부모필드에 있음
		super(name,salary);
		this.department = department;
	}
	
	//	getter / setter
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public void showInformation() {
		System.out.println("이름:"+super.getName()+"  연봉:"+super.getSalary()+"  부서:"+department);
		super.showInformation();
	}
}
