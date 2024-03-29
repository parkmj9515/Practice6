package com.javaex.ex04;

public class Customer extends User {	// 상속	(확장)
	
	//	필드
	private int point;
	
	//	기본 생성자
	public Customer() {
		
	}
	//	id password name point 설정
	public Customer(String id,String password,String name,int point) {
		//	부모 먼저 초기화
		super(id,password,name);
		this.point=point;
	}
	//	getter / setter
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public void showInfo() {	//	Use에서 protected로 선언했을때 get생략가능
		System.out.println("#아이디:"+getId()+",#패스워드:"+getpassword()+"#이름:"+getName()+"#포인트:"+point);
	}
	
	
	

}
