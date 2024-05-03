package string;
//! 제출시 package 이름 제거, Main클래스로 바꾸기

import java.util.Scanner;

//문제명: 가장 짧은 문자거리
class P10 {
    public static void main(String[] args) {
        //#스캐너로 받을시
//        Scanner kb = new Scanner(System.in);
//        String str = kb.nextLine();

        //#직접 입력
        String str = "teachermode e";

        System.out.println(solution1(str));
    }

    public static String solution1(String str) {
        String s = str.split(" ")[0];
        char t = str.split(" ")[1].charAt(0);
        int len = s.length();
        int[] arr = new int[len];
        int p = len + 10;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                arr[i] = p;
            } else {
                p++;
                arr[i] = p;
            }
        }

        p = len + 10;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) p = 0;
            else {
                p++;
                arr[i] = Math.min(arr[i], p);
            }
        }

        String answer = "";
        for (int i : arr) {
            answer += i + " ";
        }
        return answer.trim();
    }

}