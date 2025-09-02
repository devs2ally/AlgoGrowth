package String;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 설명
 * 
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 * 
 * 
 * 입력
 * 
 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 * 
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 * 
 * 
 * 출력 N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 */
public class StringReverser1_4 {

	public ArrayList<String> solution(int num, String[] strArr) {
		ArrayList<String> answer = new ArrayList<>();
		// 첫번째 방법
		// for (String str : strArr) {
		// answer.add(new StringBuilder(str).reverse().toString());
		// }

		// 두번째 방법
		for (String str : strArr) {
			char[] arr = str.toCharArray();
			int lt = 0, rt = str.length() - 1;
			while (lt < rt) {
				char tmp = arr[lt];
				arr[lt] = arr[rt];
				arr[rt] = tmp;
				lt++;
				rt--;
			}
			answer.add(String.valueOf(arr));
		}

		return answer;
	}

	public static void main(String[] args) {
		StringReverser1_4 T = new StringReverser1_4();
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		String[] str = new String[num];
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}

		for (String s : T.solution(num, str)) {
			System.out.println(s);
		}
		sc.close();
	}

}
