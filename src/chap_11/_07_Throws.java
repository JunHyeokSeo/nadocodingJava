package chap_11;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
	// 예외처리 미루기
	// 예외 발생 시, 해당 메소드를 호출한 메소드에서 예외를 처리하도록 함
	public static void main(String[] args) {
		try {
			writeFile();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("main에서 해결");
		}
	}
	
	public static void writeFile() throws IOException {
//		try {
//			FileWriter writer = new FileWriter("test.txt");
//			throw new IOException("파일 쓰기에 실패");
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.out.println("writeFile 메소드 내에서 자체 해결");
//		}
		FileWriter writer = new FileWriter("test.txt");
		throw new IOException("파일 쓰기에 실패");
	}
}
