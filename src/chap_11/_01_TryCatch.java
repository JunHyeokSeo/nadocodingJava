package chap_11;

public class _01_TryCatch {
	public static void main(String[] args) {
		// 예외 처리
		// 오류 : 컴파일 오류, 런타임 오류(에러 error : 수습 X, 예외 exception : 수습 O)
		
		// 기본적인 예외처리
		try {
			//ArithmeticException
//			System.out.println(3/0);
			
			//ArrayIndexOutOfBoundsException
//			int[] arr = new int[3];
//			arr[5] = 100;
			
			// ClassCastException
//			Object obj = "test";
//			System.out.println((int) obj);
		} catch (Exception e){
			System.out.println("예외 발생 : " + e.getMessage());
			e.printStackTrace();
		}
		
		// 예외를 catch에서 처리했으므로 순서대로 흘러가서 출력 완료
		System.out.println("정상 종료");
	}
}