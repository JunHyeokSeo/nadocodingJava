package chap_13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class _Quiz_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (BufferedReader br = new BufferedReader(new FileReader("src/chap_13/saying.txt"));){
			String quiz, answer, input;
			while (true) {
				quiz = br.readLine();
				answer = br.readLine();
				if (quiz == null || answer == null) break;
				System.out.println("(문제) " + quiz);
				System.out.print("정답 입력 =>");
				input = sc.nextLine();
				if (answer.equals(input)) System.out.println("정답입니다!\n");
				else System.out.printf("틀렸습니다. 정답은 %s입니다.\n\n", answer);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
