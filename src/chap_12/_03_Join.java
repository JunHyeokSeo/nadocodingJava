package chap_12;

import chap_12.clean.CleanRunnable;

public class _03_Join {
	public static void main(String[] args) {
		//join 지정한 시간만큼 대기 후 아래 코드 수행
		//sleep 지정한 시간만큼 프로세스 정지
		CleanRunnable cleanRunnable = new CleanRunnable();
		Thread thread = new Thread(cleanRunnable);
		thread.start();
		
		try {
			//2.5초 대기, 시간 내에 스레드가 끝나지 않으면, 아래 작업 수행
			thread.join(2500);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		
		cleanByBoss();
	}
	
	public static void cleanByBoss(){
		System.out.println("-- 사장 청소 시작 --");
		for (int i = 1; i <= 10; i += 2) {
			System.out.println("(사장) " + i + "번방 청소 중");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
		System.out.println("-- 사장 청소 끝 --");
	}
}
