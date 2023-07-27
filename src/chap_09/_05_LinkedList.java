package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
	public static void main(String[] args) {
		//Linked List
		//리스트는 중복 데이터를 허용한다
		LinkedList<String> list = new LinkedList<>();
		list.add("유재석");
		list.add("조세호");
		list.add("김종국");
		list.add("박명수");
		list.add("강호동");
		
		// 데이터 조회
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		System.out.println("------------------------------");
		
		// 추가 - 앞
		list.addFirst("서장훈");
		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println("------------------------------");
		
		// 추가 - 뒤
		list.addLast("김희철");
		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println("------------------------------");
		
		// 추가 - 중간
		System.out.println("학생 추가 전 : (index 1)" + list.get(1));
		list.add(1, "김영철");
		System.out.println("학생 추가 후 : (index 1)" + list.get(1));
		System.out.println("학생 추가 후 : (index 2)" + list.get(2));

		System.out.println("------------------------------");
		
		//삭제
		System.out.println("남은 학생 수 (제외 전) : " + list.size());
		list.remove(list.size() - 1);
		System.out.println("남은 학생 수 (제외 후) : " + list.size());
		
		System.out.println("------------------------------");
		
		// 처음 학생과 마지막 학생이 전학
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("------------------------------");
		
		System.out.println("남은 학생 수 (전학 전) : " + list.size());
		list.removeFirst(); //처음
		list.removeLast();  //마지막
		System.out.println("남은 학생 수 (전학 후) : " + list.size());
		
		System.out.println("------------------------------");
		
		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println("------------------------------");
		
		//변경
		list.set(0, "이수근");
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("------------------------------");
		//확인
		System.out.println(list.indexOf("김종국"));
		if(list.contains("김종국")) System.out.println("수강 신청 성공");
		else System.out.println("수강 신청 실패");
		
		System.out.println("------------------------------");
		
		//전체 삭제
		list.clear();
		if (list.isEmpty()) {
			System.out.println("학생 수 : " + list.size());
			System.out.println("리스트가 비었습니다.");
		}
		
		System.out.println("------------------------------");
		
		//삽입
		list.add("유재석");
		list.add("조세호");
		list.add("김종국");
		list.add("박명수");
		list.add("강호동");
		
		Collections.sort(list);
		for (String s : list) {
			System.out.println(s);
		}
	}
}
