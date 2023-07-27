package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
	public static void main(String[] args) {
//		Camera camera = new Camera(); //'Camera' is abstract; cannot be instantiated
		FactoryCam factoryCam = new FactoryCam();
		factoryCam.showMainFeature();

		SpeedCam speedCam = new SpeedCam();
		speedCam.showMainFeature();
	}
}
