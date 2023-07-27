package chap_08.camera;

public abstract class Camera {
	public void takePicture(){
		System.out.println("사진을 촬영합니다");
	}

	public void recordVideo(){
		System.out.println("동영상을 녹화합니다");
	}

	// 추상 메소드 : 메소드 선언만 존재, 자식 클래스에서 구현 필요
	public abstract void showMainFeature();
}
