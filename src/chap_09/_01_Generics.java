package chap_09;

public class _01_Generics {
	public static void main(String[] args) {
		// 제네릭스 : 다양한 타입을 지원하는 클래스나 메소드를 정의하는 방법
		// 동일한 동작을 하는 클래스나 메소드를 여러번 만들 필요 없이
		// 딱 한번만 만들고 다양한 입력값을 수용하도록 설정
		
		Integer[]  iArray = {1, 2, 3, 4, 5};
		Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
		String[] sArray = {"A", "B", "C", "D", "E"};
		
		printIntArray(iArray);
		printDoubleArray(dArray);
		printStringArray(sArray);
		
		System.out.println("-----------------------");
		//제네릭스에서 지원하는 것은 객체.
		//Wrapper Class 사용하여 기본 자료형 값을 객체로 변환하는 작업 필요
		printAnyArray(iArray);
		printAnyArray(dArray);
		printAnyArray(sArray);
	}
	
	// T를 일반적으로 많이 사용하지만, 어떤 값이 와도 상관 없음
	// <> 내부의 값과 매개변수의 자료형이 일치하기만 하면 됨
	// Type     : <T> - T[] array
	// Key      : <K> - k[] array
	// Element  : <E> - E[] array
	private static <T> void printAnyArray(T[] array){
		for (T t: array) {
			System.out.print(t + " ");
		}
		System.out.println();
	}
	
	private static void printStringArray(String[] sArray) {
		for (String str : sArray) {
			System.out.print(str + " ");
		}
		System.out.println();
	}
	
	private static void printDoubleArray(Double[] dArray) {
		for (double d : dArray) {
			System.out.print(d + " ");
		}
		System.out.println();
	}
	
	private static void printIntArray(Integer[] iArray) {
		for (int i : iArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
