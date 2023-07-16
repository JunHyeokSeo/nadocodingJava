package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        //int to String
        String s1 = String.valueOf(93);
        String s2 = Integer.toString(94);
        System.out.println(s1);
        System.out.println(s2);

        //double to String
        String str1 = String.valueOf(98.8);
        String str2 = Double.toString(98.8);
        System.out.println(str1);
        System.out.println(str2);

        //String to int
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("94.8");
        System.out.println(d);

//        오류 발생, 올바른 입력값 중요
//        int error = Integer.parseInt("자바");
    }
}
