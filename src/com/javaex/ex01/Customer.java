package com.javaex.ex01;

public class Customer extends Person{
	//	필드
	private int cNo;
	private int point;
	//	생성자
	public Customer(String name,String hp, int cNo,int point) {
		super(name,hp);	// 부모생성자 호출
		this.cNo = cNo;
		this.point = point;	
	}
	
	// getter / setter
		public int getCNo() {
			return cNo;
		}
		public void setCNo(int cNo) {
				this.cNo=cNo;
		}
		public int getPoint() {
			return point;
		}
		public void setPoint(int point) {
				this.point=point;
		}
		
		@Override
		public void showInfo() {
			System.out.println("#이름:"+super.getName()+",#핸드폰:"+super.getHp()+",#고객번호:"+cNo+"#포인트점수:"+point);
		}
	
}
