package chap_10.converter;

//어노테이션 통해 함수형 인터페이스 명시,
// 여러개의 추상 메소드 정의 방지
@FunctionalInterface
public interface Convertible {
	void convert(int USD);
	
}
