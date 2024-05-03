package string;
//! 제출시 package 이름 제거, Main클래스로 바꾸기

//문제명: 숫자만 추출

import java.util.Scanner;

class P9 {
    public static void main(String[] args) {
        //#스캐너로 받을시
//        Scanner kb = new Scanner(System.in);
//        String str = kb.nextLine();

        //#직접 입력
        String str = "g0en2T0s8eSoft";

        System.out.println(solution1(str));
    }

    public static int solution1(String str) {
        str = str.replaceAll("[^0-9]", "");
        return Integer.parseInt(str);
    }

}