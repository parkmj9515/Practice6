package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] users = new User[3];	//	user클래스와 하위 클래스를 모두 담을수 있는 배열
		
		User u01 = new Customer("jws","j123","정우성",1000);	//	고객
		User u02 = new Customer("yjs","y2345","이효리",2000);	//	고객
		User u03 = new Employee("master","m7788","운영자",5_000_000);	//	운영자
		
		//	세 명의 사용자를 배열에 등록
		//	참조 자료형의 배열은 참조객체의 주소가 할당 > 객체가 직접 들어가는것은 아니다
		
		users[0] = u01;
		users[1] = u02;
		users[2] = u03;
		
		for(int i=0; i < users.length; i++) {
			users[i].showInfo();
		}
		
		//	다운 캐스팅 
		int salary = ((Employee)u03).getSalary();	// User > Employee로 다운캐스팅
		System.out.println("운영자의 월급은" + salary + "원 입니다");
		
		
		
//		User u = new User("jws","j1234","정우성");
//		User u1 = new User("yjs","y2345","이효리");
//		User u2 = new User("master","m7788","운영자");
//		
//		Customer c = new Customer("jws","j1234","정우성",1000);
//		Customer c1 = new Customer("yjs","y2345","이효리",2000);
//		Employee e = new Employee("master","m7788","운영자",500000);
//		c.showInfo();
//		c1.showInfo();
//		e.showInfo();
		
	
		
		
		
		
	
	
	}

}
