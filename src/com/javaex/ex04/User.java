package com.javaex.ex04;

public class User {
	//	필드
	private String id;
	private String password;
	private String name;
	
	//	기본 생성자
	public User() {
		
	}
	//	전체 필드 생성자	(외부로부터 파라미터 데이터를 받아서 내부필드에 세팅)
	public User(String id,String password,String name) {
		this.id=id;
		this.password=password;
		this.name = name;
	}
	
	// getter / setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	
	public String getpassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	
	public String getName() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	
	public void showInfo() {
		System.out.println("#아이디:"+id+","+"#패스워드:"+password+","+"이름:"+name+",");
	}
}
