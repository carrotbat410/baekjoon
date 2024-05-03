package string;
//! 제출시 package 이름 제거, Main클래스로 바꾸기

import java.util.Scanner;
//문제명:  특정 문자 뒤집기

//
class P5 {

    public static void main(String[] args) {

        //#스캐너로 받을시
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next();

        //#직접 입력
        String str = "a#b!GE*T@S";

        String answer = solution1(str);
        System.out.println(answer);
    }

    public static String solution1(String str) {
        int lt = 0;
        int rt = str.length() - 1;
        char[] s = str.toCharArray();

        while(lt < rt) {
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }

        return String.valueOf(s);
    }
}
