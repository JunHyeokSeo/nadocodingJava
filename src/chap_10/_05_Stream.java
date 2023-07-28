package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
	public static void main(String[] args) {
		// 스트림 (데이터 가공, 필터링) : 컬렉션 및 배열, 파일에서 만들어질 수 있다
		// 스트림은 한번 사용하면 다시 사용할 수 없기 때문에 매번 새롭게 스트림을 생성해야 한다.
		// 스트림을 수정해도 원본 데이터는 변하지 않는다.
		
		// [스트림 생성]
		// 1. Arrays.stream
		int[] scores = {100, 95, 90, 85, 80};
		IntStream scoreStream = Arrays.stream(scores);
		String[] langs = {"Python", "java", "javascript", "c", "c++", "c#"};
		Stream<String> langStream = Arrays.stream(langs);
		
		// 2. Collection.stream()
		List<String> langList = new ArrayList<>();
//		langList.add("Python");
//		langList.add("Java");
		langList = Arrays.asList("Python", "java", "javascript", "c", "c++", "c#");
//		System.out.println(langList.size());
		Stream<String> langListStream = langList.stream();
		
		// 3. Stream.of()
		Stream<String> LangListofStream = Stream.of("Python", "java", "javascript", "c", "c++", "c#");
		
		// [스트림 사용]
		// 중간 연산 (Intermediate Operation) : filter, sorted, distinct, skip ...
		// 최종 연산 (Terminal Operation) : count, min, max, sum ...
		
		//90점 이상인 점수만 필터링
		Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
//		Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println); //클래스명::메소드명
		System.out.println("---------------------------");
		
		// 90점 이상인 사람의 수
		int count = (int) Arrays.stream(scores).filter(x -> x >=90).count(); //return : long
		System.out.println(count);
		System.out.println("---------------------------");
		
		// 90점 이상인 점수들의 합
		int sum = Arrays.stream(scores).filter(x -> x >=90).sum(); //return : int
		System.out.println(sum);
		System.out.println("---------------------------");
		
		// 90점 이상인 점수들을 오름차순 정렬
		Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
		System.out.println("---------------------------");
		
		//"Python", "Java", "javascript", "c", "c++", "c#"
		// c 로 시작하는 프로그래밍 언어
		Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);
		System.out.println("---------------------------");
		
		// java라는 글자를 포함하는 언어
		Arrays.stream(langs).filter(x -> x.contains("java")).forEach(System.out::println);
		System.out.println("---------------------------");
		
		// 4글자 이하의 언어를 정렬
		langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
		System.out.println("---------------------------");
		
		//4글자 이하의 언어 중에서 c라는 글자를 포함하는 언어
//		langList.stream().filter(x -> x.length() <= 4).filter(x -> x.contains("c")).forEach(System.out::println);
		langList.stream().filter(x -> x.length() <= 4 && x.startsWith("c")).forEach(System.out::println);
		System.out.println("---------------------------");
		
		//4글자 이하의 언어중 c라는 글자를 포함하는 언어가 하나라도 있는지 여부
		boolean anyMatch = langList.stream().filter(x -> x.length() <= 4).anyMatch(x -> x.contains("c"));
		System.out.println(anyMatch);
		System.out.println("---------------------------");
		
		//3글자 이하의 언어들은 모두 c라는 글자를 포함하는지 여부
		boolean allMatch = langList.stream().filter(x -> x.length() <= 3).allMatch(x -> x.contains("c"));
		System.out.println(allMatch);
		System.out.println("---------------------------");
		
		//4글자 이하의 언어 중에서 c라는 글자를 포함하는 언어 뒤에 (어려워요)라는 글자를 함께 출력
		//map : 데이터를 원하는 형태로 가공, 꺼내고 싶은 인스턴스 지정 가능
		langList.stream().filter(x -> x.length() <= 4).filter(x -> x.contains("c")).map(x -> x + " (어려워요)").forEach(System.out::println);
		System.out.println("---------------------------");
		
		//c라는 글자를 포함하는 언어를 대문자로 표현
		langList.stream().filter(x -> x.contains("c")).map(String::toUpperCase).forEach(System.out::println);
		System.out.println("---------------------------");
		
		//가공된 데이터를 리스트 형태로
		List<String> langListStartsWithC = langList.stream().filter(x -> x.contains("c")).map(String::toUpperCase).collect(Collectors.toList());
		langListStartsWithC.stream().forEach(System.out::println);
		
		
	}
}
