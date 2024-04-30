package string;

import java.util.*;

//문제명: 대소문자 변환

class P2 {
    public static void main(String[] args) {
        P2 T = new P2();

        //#스캐너로 받을시
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next();

        //#직접 입력
        String str = "StuDY";

        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            System.out.println("x:"+x);
            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }
        return answer;
    }

}
