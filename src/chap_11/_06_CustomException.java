package chap_11;

public class _06_CustomException {
	public static void main(String[] args) {
		// 사용자 정의 예외
		// 예외 관련 클래스 상속 받아 구현
		// 생성자 정의 필요
		int age = 17;
		try {
			if (age < 19){
				//				System.out.println("19세 미만 판매 불가");
				throw new AgeLessThen19Exception("19세 미만 판매 불가");
			} else {
				System.out.println("주문하신 상품 여기 있습니다");
			}
			//			System.out.println(3 / 0);
		} catch (AgeLessThen19Exception e){
			System.out.println("조금 더 성장한 뒤에 오세요");
		} catch (Exception e){
			System.out.println("모든 예외 처리");
		}
	}
}

class AgeLessThen19Exception extends Exception{
	public AgeLessThen19Exception(String message) {
		super(message);
	}
}