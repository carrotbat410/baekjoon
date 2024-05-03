package string;
//! 제출시 package 이름 제거, Main클래스로 바꾸기

import java.util.Scanner;

//문제명: 암호

/**
 * # replace, replaceAll 차이
 * replaceAll은 정규표현식 인자로받음.
 * 참고: https://djusti.tistory.com/8
 */

/**
 * # parseInt(String, "표현할 진수")
 */

class P12 {
    public static void main(String[] args) {
        //#스캐너로 받을시
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        kb.nextLine();
//        String str = kb.nextLine();

        //#직접 입력
        int n = 4;
        String str = "#****###**#####**#####**##**";

        System.out.println(solution1(n, str)); //COOL
    }

    public static String solution1(int n, String str) {
        String answer="";
        for(int i=0; i<n; i++){
            String tmp= str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num; //! 아스키 코드 char로 캐스팅하면 문자됨.
            str = str.substring(7);
        }
        return answer;
    }

}