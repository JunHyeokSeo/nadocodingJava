package chap_07;

public class _06_ClassMethod {
    public static void main(String[] args) {
//        BlackBox b1 = new BlackBox();
//        b1.callServiceCenter();
//
//        BlackBox b2 = new BlackBox();
//        b2.callServiceCenter();

        BlackBox.callServiceCenter();

        //클래스 메소드 : 객체 생성 없이도 호출 가능(모든 객체가 공유하는 동일한 기능)
        //인스턴스 메소드 : 객체마다 서로 다른 기능을 수행할 수 있음
        String s = String.valueOf(3);
    }
}
