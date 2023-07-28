package chap_10;

public class _02_AnonymousClass2 {
	public static void main(String[] args) {
		HomeMadeBurger momMadeBurger = getMomMadeBurger();
		momMadeBurger.cook();
		System.out.println("-----------------------------");
		
		HomeMadeBurger broMadeBurger = getBroMadeBurger();
		broMadeBurger.cook();
		System.out.println("-----------------------------");
	}
	
	private static HomeMadeBurger getBroMadeBurger() {
		return new HomeMadeBurger() {
			@Override
			public void cook() {
				System.out.println("집에서 만드는 동생표 군대리아");
				System.out.println("재료 : 빵, 치킨패티, 양배추 샐러드, 딸기잼, 치즈, 삶은 계란");
			}
		};
	}
	
	// HomeMadeBurger 객체 반환 메소드
	// 익명 클래스에서 메소드를 Override 하는 과정을 main 안에 정의하면 코드가 복잡해짐
	// 익명 클래스 객체 생성을 위한 메소드를 별도로 정의
	public static HomeMadeBurger getMomMadeBurger(){
		return new HomeMadeBurger() {
			@Override
			public void cook() {
				System.out.println("집에서 만드는 엄마표 수제 버거");
				System.out.println("재료 : 빵, 소고기 패티, 해시브라운, 양상추, 마요네즈, 피클");
			}
		};
	}
}

// 집집마다 요리가 다르기 때문에, 하나의 클래스로 정의하기 애매함
// 방법1. 추상 클래스 -> 상속 받는 클래스 -> 상속 받는 클래스의 객체를 생성
//      위 방식대로 추상 클래스를 상속 받아 새로운 클래스를 정의해도,
//      해당 클래스를 사용하는 객체가 하나 뿐이라면 효율성이 떨어진다
// 방법2. 추상 클래스 -> 익명 클래스
//      익명 클래스를 통해 특정 객체를 위한 메소드 오버라이딩 가능
abstract class HomeMadeBurger{
	public abstract void cook();
}

// 추상 클래스와 추상 메소드가 아니어도 정상 동작
// 익명 클래스의 대상은 인터페이스 및 추상 클래스가 일반적
//class HomeMadeBurger{
//	public void cook(){};
//}