package string;
//! 제출시 package 이름 제거, Main클래스로 바꾸기
//문제명: 문장 속 단어(가장 긴 단어 출력)

import java.util.Scanner;

class P3 {
    public static void main(String[] args) {
        P3 T = new P3();

        //#스캐너로 받을시
//        Scanner kb = new Scanner(System.in);
//        String str = kb.nextLine();
        //#직접 입력
        String str = "it is time to study";

        System.out.println(T.solution1(str));
    }

    public String solution1(String str) {
        String answer = "";
        int max = 0;
        String[] strArr = str.split(" ");
        for (String s : strArr) {
            if(s.length() > max) {
                max = s.length();
                answer = s;
            }
        }
        return answer;
    }

    //indexOf + substring 사용한 풀이
    public String solution2(String str) {
        String answer = "";
        int maxLen = 0;
        int pos = 0;
        while ((pos = str.indexOf(" ")) != -1) {
            String tmpStr = str.substring(0, pos);
            if(tmpStr.length() > maxLen) {
                maxLen = tmpStr.length();
                answer = tmpStr;
            }
            str = str.substring(pos + 1);
        }
        if(str.length() > maxLen) answer = str;
        return answer;
    }

}
