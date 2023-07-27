package chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
	public static void main(String[] args) {
		// HashSet 중복 허용 X, 순서 보장 X
		// LinkedHashSet : 중복 허용 X, 순서 보장 O
		
		HashSet<String> set = new HashSet<>();
		//삽입
		set.add("삼겹살");
		set.add("쌈장");
		set.add("음료");
		set.add("소금");
		set.add("후추");
		set.add("삼겹살");
		set.add("깻잎");
		set.add("상추");
		set.add("삼겹살");
		
		//확인
		System.out.println("총 구매 상품 수 : " + set.size());
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("------------------------");
		
		if (set.contains("삼겹살")) System.out.println("삼겹살 사러 출발");
		
		System.out.println("------------------------");

		//삭제
		System.out.println("총 구매 상품 수 (삼겹살 구매 전) : " + set.size());
		set.remove("삼겹살");
		System.out.println("총 구매 상품 수 (삼겹살 구매 후) : " + set.size());
		
		System.out.println("------------------------");
	
		//전체 삭제
		set.clear();
		if (set.isEmpty()) {
			System.out.println("남은 구매 상품 수 : " + set.size());
			System.out.println("집으로 출발");
		}

		System.out.println("------------------------");

		// LinkedHashSet : 중복 허용 X, 순서 보장 O
		HashSet<Integer> intset = new LinkedHashSet<>();
		intset.add(1);
		intset.add(13);
		intset.add(2);
		
		for (int i : intset) {
			System.out.println(i);
		}
	}
}
