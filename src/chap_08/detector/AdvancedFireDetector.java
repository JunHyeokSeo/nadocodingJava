package chap_08.detector;

public class AdvancedFireDetector implements Detectable{
	@Override
	public void detect() {
		System.out.println("향상된 성능으로 화재 감지");
	}
}
