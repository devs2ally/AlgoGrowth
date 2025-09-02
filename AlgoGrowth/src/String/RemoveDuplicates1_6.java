package String;

import java.util.Scanner;

public class RemoveDuplicates1_6 {

    /**
     * 설명
     * 
     * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
     * 
     * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
     * 
     * 
     * 입력
     * 
     * 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
     * 
     * 
     * 출력
     * 
     * 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
     */
    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            // System.out.println(str.charAt(i)+ " " + i + " " +
            // str.indexOf(str.charAt(i)));
            if (str.indexOf(str.charAt(i)) == i) { // 중복 제거
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        RemoveDuplicates1_6 T = new RemoveDuplicates1_6();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
        sc.close();

    }
}
