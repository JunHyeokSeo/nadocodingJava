package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VIPUser;

public class _02_GenericClass {
	public static void main(String[] args) {
		// 제네릭 클래스
		CoffeeByNumber c1 = new CoffeeByNumber(33);
		c1.ready();
		
		CoffeeByNickname c2 = new CoffeeByNickname("유재석");
		c2.ready();
		
		System.out.println("----------------------------");
		
		// 다양한 자료형을 만족하는 클래스를 구현하는 법
		// 1. Object 클래스를 자료형으로 받는 클래스 생성
		CoffeeByName c3 = new CoffeeByName(34);
		c3.ready();
		CoffeeByName c4 = new CoffeeByName("박명수");
		c4.ready();
		
		System.out.println("----------------------------");
		
		int c3Name = (int) c3.name;
		System.out.println("주문 고객 번호 : " + c3Name);
		
		String c4Name = (String) c4.name;
		System.out.println("주문 고객 이름 : " + c4Name);
		
		// Object 형태로 저장한 int 값을 String으로 변환 - 오류 발생
		// Object -> String 변환을 시도하는 구문이라,
		// 실제 실행되기 전까지는 오류가 발생하는지 확일할 수 없다.
		// !!----이러한 문제를 해결하기 위해 제네릭 클래스를 사용할 수 있다----!!
//		c4Name = (String) c3.name;
		
		System.out.println("----------------------------");
		
		// 제네릭을 통해 입력값의 자료형을 지정 -> 형변환 없이 name을 저장하여 출력 가능
		// 생성자 매개변수에 다른 타입의 값 입력 시, 오류 발생
		Coffee<Integer> c5 = new Coffee<>(35);      // Only Integer
		c5.ready();
		int c5Name = c5.name;
		System.out.println("주문 고객 번호 : " + c5Name);
		
		Coffee<String> c6 = new Coffee<>("조세호"); // Only String
		c6.ready();
		String c6Name = c6.name;
		System.out.println("주문 고객 이름 : " + c6Name);
		
		System.out.println("----------------------------");
		
		//사용자 정보 관리 기능 구현
		CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
		c7.ready();
		
		CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("서장훈"));
		c8.ready();
		
		System.out.println("----------------------------");
		orderCoffee("김영철");
		orderCoffee(36);
		System.out.println("----------------------------");
		orderCoffee("김희철", "아메리카노");
		orderCoffee("37", "라떼");
	}
	
	//단일 값을 받는 제네릭 메소드
	private static <T> void orderCoffee(T name){
		System.out.println("커피 준비 완료 : " + name);
	}
	
	//2개 이상의 값을 받는 제네릭 메소드
	private static <T, V> void orderCoffee(T name, V coffee){
		System.out.println(coffee + " 준비 완료 : " + name);
	}
}
