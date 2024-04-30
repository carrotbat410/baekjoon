package string;

import java.util.*;

//문제명: 문자 찾기

class P1 {
    public static void main(String[] args) {
        P1 T = new P1();

        //스캐너로 받을시
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        //직접 입력
//        String str = "Computercooler";
//        char c = 'c';

        System.out.println(T.solution(str, c));
    }

    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == t) answer++;
        }
        return answer;
    }

    //향상된 반복문 이용한 풀이
    public int solution2(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for(char x : str.toCharArray()) {
            if(x == t) answer++;
        }
        return answer;
    }


}
