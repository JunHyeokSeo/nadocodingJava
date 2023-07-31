package chap_11;

public class _05_TryWithResources {
	public static void main(String[] args) {
		//중첩되는 try-catch 가능
		MyFileWriter writer1 = null;
		try{
			writer1 = new MyFileWriter();
			writer1.write("아이스크림이 먹고 싶어요");
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			try {
				writer1.close();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		
		System.out.println("------------------------");
		// try 내부에서 사용할 객체를 괄호 안에서 정의할 경우
		// 자동으로 close 메소드를 호출해줌 (AutoCloseable 인터페이스를 구현해야만 가능)
		try (MyFileWriter writer2 = new MyFileWriter()){
			writer2.write("빵이 먹고 싶어요");
		} catch (Exception e){
			e.printStackTrace();
		}
		
		// 파일을 쓰기 위해 자주 사용되는 클래스
		// AutoCloseable 클래스를 상속 받는 하위 객체중 하나.
		// 괄호 내부에 객체 정의 시, 자동으로 Close 가능
//		BufferedWriter bw = null;
		
	}
}

class MyFileWriter implements AutoCloseable{
	
	@Override
	public void close() throws Exception {
		System.out.println("파일을 정상적으로 닫습니다.");
	}
	
	public void write(String line){
		System.out.println("파일에 내용 입력");
		System.out.println("입력 내용 : " + line);
	}
}
