package chap_11;

public class _03_Throw {
	public static void main(String[] args) {
		// throw, 단일 예외를 명시적으로 체크하기 위함
		// try-catch, 예외가 발생하더라도, 구동중이던 애플리케이션이 중간에 멈추지 않게 하는 역할
		// throw를 통해 자신을 호출한 상위 메서드로 예외를 던질 수 있음
		
		int age = 17;
		try {
			if (age < 19){
//				System.out.println("19세 미만 판매 불가");
				throw new Exception("19세 미만 판매 불가");
			} else {
				System.out.println("주문하신 상품 여기 있습니다");
			}
//			System.out.println(3 / 0);
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
