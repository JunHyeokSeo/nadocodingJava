package chap_09.coffee;

import chap_09.user.User;

//User를 상속하는 클래스만 입력 받을 수 있다
//입력값 제한 가능
public class CoffeeByUser <T extends User>{
	public T user;
	
	public CoffeeByUser(T user) {
		this.user = user;
	}
	
	public void ready(){
		System.out.println("커피 준비 완료 : " + user.name);
		user.addPoint();
	}
}
