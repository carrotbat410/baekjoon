package string;
//! 제출시 package 이름 제거, Main클래스로 바꾸기

//문제명: 팰린드롬(replaceAll 정규식이용)

import java.util.Scanner;

class P8 {
    public static void main(String[] args) {
        //#스캐너로 받을시
        Scanner kb = new Scanner(System.in);
        //! kb.next();는 abc aa 입력하면 띄어쓰기인 abc까지만 받음.
        //! 줄바꾸기 전까지 받으려면 nextLine() 사용하기.
        String str = kb.nextLine();

        //#직접 입력
//        String str = "found7, time: study; Yduts; emit, 7Dnuof";

        String answer = solution1(str);
        System.out.println(answer);
    }


    public static String solution1(String str) {
        str = str.replaceAll("[^a-zA-Z]", "");
        String reversedStr = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(reversedStr)) return "YES";
        return "NO";
    }

}