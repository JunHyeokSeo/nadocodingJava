package chap_11;

public class _02_Catch {
	public static void main(String[] args) {
		try {
			System.out.println(3 / 0);
			
			//				int[] arr = new int[3];
			//				arr[5] = 100;
			
			//				Object obj = "test";
			//				System.out.println((int) obj);
			
			//			    String s = null;
			//			    System.out.println(s.toLowerCase());
		}
		// Exception 모든 예외의 조상 클래스
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
			System.out.println("실수");
		//		catch (ArrayIndexOutOfBoundsException e){
		//		System.out.println("인덱스 잘못 설정");
		//
		} catch (ClassCastException e){
			System.out.println("잘못된 형 변환");
		} catch (Exception e){
			System.out.println("그 외의 모든 에러");
			e.printStackTrace();
		}
		
		System.out.println("정상 종료");
	}
}
