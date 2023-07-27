package chap_08.detector;

public class AccidentDetector implements Detectable{
	
	@Override
	public void detect() {
		System.out.println("교통사고 감지");
	}
}
