package String;

import java.util.Scanner;

public class Palindrom1_8 { // 회문문자열 - 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열

    /**
     * 설명

        앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.

        문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.

        단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.

        알파벳 이외의 문자들의 무시합니다.


        입력

        첫 줄에 길이 100을 넘지 않는 공백이 있는 문자열이 주어집니다.


        출력

        첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.


     */
    public String solution(String str) {
        String answer = "NO";

        // str = str.toUpperCase();
        // int len = str.length();
        //
        // for (int i = 0; i <len; i++) {
        //
        // if (i < len/2) {
        // if (str.charAt(i) != str.charAt(len-i-1)) {
        // answer = "NO";
        // }
        // }
        // }

        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Palindrom1_7 T = new Palindrom1_7();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(T.solution(str));
        sc.close();
    }
}
