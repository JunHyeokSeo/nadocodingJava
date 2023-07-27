package chap_09;

import java.util.*;

public class _08_Iterator {
	public static void main(String[] args) {
		//Iterator : 자료구조 순회, 커서가 위치하는 값을 가져옴
		List<String> list = new ArrayList<>();
		list.add("유재석");
		list.add("(알 수 없음)");
		list.add("김종국");
		list.add("(알 수 없음)");
		list.add("강호동");
		list.add("(알 수 없음)");
		list.add("박명수");
		list.add("(알 수 없음)");
		list.add("조세호");
		
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("------------------------------");
		
		Iterator<String> it = list.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		System.out.println("------------------------------");
		it = list.iterator(); //커서를 다시 맨 앞으로 보내기 위해 재 초기화
		while (it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("------------------------------");
		it = list.iterator();
		while (it.hasNext()){
			String s = it.next();
			if (s.contains("(알 수 없음)")){
				it.remove(); //삭제
			}
		}
		
		System.out.println("------------------------------");
		it = list.iterator(); //커서를 다시 맨 앞으로 보내기 위해 재 초기화
		while (it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("------------------------------");
		HashSet<String> set = new HashSet<>();
		set.add("유재석");
		set.add("박명수");
		
		Iterator<String> itSet = set.iterator();
		while (itSet.hasNext()){
			System.out.println(itSet.next());
		}
		
		System.out.println("------------------------------");
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("유재석", 10);
		map.put("박명수", 5);
		
		//map.iterator() - 제공되지 않음 (키-값 쌍)
		//1. key에 대한 iterator
		Iterator<String> itMapKey = map.keySet().iterator();
		while (itMapKey.hasNext()){
			System.out.println(itMapKey.next());
		}
		System.out.println("------------------------------");
		
		//2. value에 대한 iterator
		Iterator<Integer> itMapValue = map.values().iterator();
		while (itMapValue.hasNext()){
			System.out.println(itMapValue.next());
		}

		System.out.println("------------------------------");
		
		//Key-Value 쌍으로 출력하기
		Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
		while(itMap.hasNext()){
			System.out.println(itMap.next());
		}
		
	}
}
