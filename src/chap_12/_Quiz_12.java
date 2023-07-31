package chap_12;

public class _Quiz_12 {
	public static void main(String[] args) {
		Runnable gift1 = new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("A 상품 준비 " + i + "/5");
				}
				System.out.println("-- A 상품 준비 완료 --");
			}
		};
		Runnable gift2 = new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("B 상품 준비 " + i + "/5");
				}
				System.out.println("-- B 상품 준비 완료 --");
			}
		};
		Runnable set = new Runnable() {
			@Override
			public void run() {
				System.out.println("== 세트 상품 포장 시작 ==");
				for (int i = 1; i <= 5; i++) {
					System.out.println("세트 상품 포장 " + i + "/5");
				}
				System.out.println("== 세트 상품 포장 완료 ==");
			}
		};
		Thread giftThread1 = new Thread(gift1);
		Thread giftThread2 = new Thread(gift2);
		giftThread1.start();
		giftThread2.start();

//		방법 1. isAlive 메소드
//		while (giftThread1.isAlive() || giftThread2.isAlive()){ }

//		방법 2. join 매소드
//		매개변수 없는 join? 해당 프로스세스가 종료될 때까지, 대기
		try {
			giftThread1.join();
			giftThread2.join();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		Thread setThread = new Thread(set);
		setThread.start();
	}
}

