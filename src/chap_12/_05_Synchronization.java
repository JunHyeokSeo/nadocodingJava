package chap_12;

import chap_12.clean.Room;

public class _05_Synchronization {
	public static void main(String[] args) {
		// 동기화
		// 순차적인 작업 수행
		// 다중 스레드에서 변수, 메소드에 동시 접근 시, 문제 발생
		// 특정 스레드가 메소드를 사용중이라면, 다른 스레드의 접근을 막아 오류 방지
		// 스레드에서 오류가 발생하더라도 다른 스레드에는 영향을 미치지 않는다.
		
		// (synchronization)
		Room room = new Room();
		Runnable cleaner1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("-- 직원1 청소 시작 --");
				for (int i = 1; i <= 5; i++) {
					room.clean("직원1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
					
					if (i == 2) {
						throw new RuntimeException("못해먹겠다");
					}
				}
				System.out.println("-- 직원1 청소 끝 --");
			}
		};
		
		Runnable cleaner2 = () -> {
			System.out.println("-- 직원2 청소 시작 --");
			for (int i = 1; i <= 5; i++) {
				room.clean("직원2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
			System.out.println("-- 직원2 청소 끝 --");
		};
		
		Thread cleanerThread1 = new Thread(cleaner1);
		Thread cleanerThread2 = new Thread(cleaner2);
		
		cleanerThread1.start();
		cleanerThread2.start();
	}
}
