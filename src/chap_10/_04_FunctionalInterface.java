package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
	public static void main(String[] args) {
		KRWConverter converter = new KRWConverter();
//		converter.convert(2);
		
		//메소드 매개변수로 Converter 객체 전달
//		convertUSD(converter, 2);
		
		// 매개변수로 메소드 직접 전달
//		convertUSD(public void convert(int USD) {
//			System.out.println(USD + "달러 = " + (USD * 1400) + "원");
//		} , 2);

		// 매개변수로 람다식 전달
		// Convertible 객체와 람다식이 매핑된 형태
//		convertUSD((USD) -> System.out.println(USD + "달러 = " + (USD * 1400) + "원") , 2);
		
		// 함수형 인터페이스
		// 사용조건 : 인터페이스 내부에 하나의 추상 메소드만 존재
		Convertible convertible = (USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + "원");
		convertUSD(convertible, 2);
		
		//전달값이 하나도 없다면?
		ConvertibleWithNoParams c1 = () -> System.out.println("1 달러 = 1400원");
		c1.convert();
		
		// 두 줄 이상의 코드가 있다면?
		c1 = () -> {
			int USD = 5;
			int KRW = 1400;
			System.out.println(USD + " 달러 = " + (USD * KRW) + "원");
		};
		c1.convert();
		
		// 전달값이 2개인 경우
		ConvertibleWithTwoParams c2 = (d, w) -> System.out.println(d + " 달러 = " + (d * w) + "원");
		c2.convert(10, 1400);
		
		//반환값이 있는 경우(return이 있으면 중괄호 필수, but return 자체를 생략할 수 있다)
//		ConvertibleWithReturn c3 = (d, w) -> { return d * w; };
		ConvertibleWithReturn c3 = (d, w) -> d * w;
		int result = c3.convert(20, 1400);
		System.out.println("20 달러 = " + result + "원");
	}
	
	public static void convertUSD(Convertible converter, int USD){
		converter.convert(USD);
	}
}
