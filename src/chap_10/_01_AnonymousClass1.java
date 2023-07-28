package chap_10;

public class _01_AnonymousClass1 {
	public static void main(String[] args) {
		// 익명 클래스
		// 클래스 내부에도 클래스를 정의할 수 있다. 이를 내부 클래스라 한다.
		// 내부 클래스 중 특별한 것 중 하나가 익명 클래스이다
		
		Coffee c1 = new Coffee();
		c1.order("아메리카노");
		System.out.println("-------------------");
		
		Coffee c2 = new Coffee();
		c2.order("라떼");
		System.out.println("-------------------");
		
		// 굉장히 친한 친구 방문
		// specialCoffee라는 객체를 위해 내부에서 메소드 동작 재정의
		// 객체 하나만을 위한 클래스. 번거롭게 상속 및 다형성 생성하지 않아도 됨
		Coffee specialCoffee = new Coffee() {
			@Override
			public void order(String coffee) {
				super.order(coffee);
				System.out.println("(귓속말) 딸기 케이크는 서비스예요.");
			}
			@Override
			public void returnTray() {
				System.out.println("(귓속말) 자리에 두시면 제가 치울게요");
			}
		};
		
		specialCoffee.order("바닐라 라떼");
		specialCoffee.returnTray();
		System.out.println("-------------------");
	}
}

class Coffee {
	public void order(String coffee){
		System.out.println("주문하신 " + coffee + " 나왔습니다.");
	}
	
	public void returnTray(){
		System.out.println("커피 반납이 완료되었습니다.");
	}
}