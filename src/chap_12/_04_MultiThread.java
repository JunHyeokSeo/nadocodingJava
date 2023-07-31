package chap_12;

public class _04_MultiThread {
	public static void main(String[] args) {
		//다중 스레드, 필요한 만큼 스레드를 만들어서 동시에 작업을 수행할 수 있다
		
		//익명클래스
		Runnable cleaner1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("-- 직원1 청소 시작 --");
				for (int i = 1; i <= 10; i += 2) {
					System.out.println("(직원1) " + i + "번방 청소 중 ");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
				}
				System.out.println("-- 직원1 청소 끝 --");
			}
		};
		
		//람다식
		Runnable cleaner2 = () -> {
			System.out.println("-- 직원2 청소 시작 --");
			for (int i = 2; i <= 10; i += 2) {
				System.out.println("(직원2) " + i + "번방 청소 중 ");
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
