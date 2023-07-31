package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
	public static void main(String[] args) {
		// Thread
		// 하나의 process는 여러개의 thread 소유 가능
		// 별도의 지정이 없다면 Java는 기본적으로 1 process, 1 thread
		// Thread 클래스를 상속 받는 새로운 클래스 생성, run 메소드를 정의
		// but run 메소드를 직접 호출하면 다중 스레드 환경 X
		// Thread 객체의 start 메소드를 호출하여 다중 스레드 환경 구현 가능
		
//		cleanBySelf();
		CleanThread cleanThread = new CleanThread();
//		cleanThread.run(); //직원 청소
		cleanThread.start();
		cleanByBoss(); //사장 청소
	}
	
	public static void cleanBySelf(){
		System.out.println("-- 혼자 청소 시작 --");
		for (int i = 1; i <= 10; i++) {
			System.out.println("(혼자) " + i + "번방 청소 중");
		}
		System.out.println("-- 혼자 청소 끝 --");
	}
	
	public static void cleanByBoss(){
		System.out.println("-- 사장 청소 시작 --");
		for (int i = 1; i <= 10; i += 2) {
			System.out.println("(사장) " + i + "번방 청소 중");
		}
		System.out.println("-- 사장 청소 끝 --");
	}
}
