package String;

import java.util.ArrayList;
import java.util.Scanner;

public class StringReverser {

	public ArrayList<String> solution(int num, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		// StringBuilder reverse
//		for(String x : str) {
//			String tmp = new StringBuilder(x).reverse().toString(); 
//			answer.add(tmp);
//		}
		// str[] = good, time
		// x = good 먼저
		// s = g/o/o/d
		for (String x : str) {
			char[] s = x.toCharArray();
			int lt = 0, rt = x.length()-1;
			while(lt < rt) { // 0 < 4
				char tmp = s[lt]; // tmp = g
				s[lt] = s[rt]; // s = d o o d
				s[rt] = tmp;   // s = d o o g
				lt++; // 1
				rt--; // 3
			}
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		StringReverser T = new StringReverser();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str[] = new String[num];
		for (int i = 0; i < num; i++) {
			str[i] = sc.next();
		}
		for (String x : T.solution(num, str)) {
			System.out.println(x);
		}
		
		sc.close();
	}

}
