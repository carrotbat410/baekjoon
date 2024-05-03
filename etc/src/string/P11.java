package string;
//! 제출시 package 이름 제거, Main클래스로 바꾸기

import java.util.Scanner;

//문제명: 문자열 압축
//* 숫자 -> 문자로 바꾸는 방법 2가지
//1.String.valueOf(): String
//2.Integer.toString(): String
class P11 {
    public static void main(String[] args) {
        //#스캐너로 받을시
//        Scanner kb = new Scanner(System.in);
//        String str = kb.nextLine();

        //#직접 입력
        String str = "KKHSSSSSSSE"; //K2HS7E
//        String str = "KSTTTSEEKFKKKDJJGG"; //KST3SE2KFK3DJ2G2

        System.out.println(solution1(str + " ")); //! 마지막꺼 넣어주려고 띄어쓰기 추가함.
    }

    public static String solution1(String str) {
        String answer = "";
        char[] charArr = str.toCharArray();

        char tmp = charArr[0];
        int cnt = 1;

        for(int i = 1; i < str.length(); i++) {
            if(tmp == charArr[i]) cnt++;
            else {
                answer += tmp;
                if(cnt != 1) answer += String.valueOf(cnt);
                tmp = charArr[i];
                cnt = 1;
            }
        }
        return answer;
    }

}