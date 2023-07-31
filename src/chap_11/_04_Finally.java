package chap_11;

public class _04_Finally {
	public static void main(String[] args) {
		// finally : 에러 발생 여부와 관계없이 실행
		
		try{
			System.out.println("택시의 문을 연다");
			throw new Exception("휴무 택시");
//			System.out.println("택시 탑승");
		} catch (Exception e){
			System.out.println("문제 발생 : " + e.getMessage());
		} finally {
			System.out.println("택시의 문을 닫는다");
		}
		
		//try + catch(s)
		//try + catch(s) + finally
		//try + finally
		
		System.out.println("--------------------------------");
		//try 미사용? 에러발생으로 프로그램 종료
		//try를 사용하여 프로그램이 중간에 종료되는 것 방지
		
		try{
			System.out.println(3/0);
		}finally {
			System.out.println("프로그램 정상 종료");
		}
	}
}
