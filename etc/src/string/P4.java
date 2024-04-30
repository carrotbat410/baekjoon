package string;
//! 제출시 package 이름 제거, Main클래스로 바꾸기

import java.util.ArrayList;
import java.util.Scanner;
//문제명: 단어 뒤집기
/** INFO
 * String은 불변객체라 계속 새로운 객체 만들어 무거움. (간단한 작업용)
 * 더 다양한기능 + 가벼운 StringBuilder 사용하기
 */
class P4 {

    public static void main(String[] args) {
        P4 T = new P4();

        //#스캐너로 받을시
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        String[] strArr = new String[n];
//        for(int i = 0; i < n; i++) {
//            strArr[i] = kb.next();
//        }

        //#직접 입력
        int n = 3;
        String[] strArr = {"good", "Time", "Big"};

        ArrayList<String> answerArr = T.solution1(n, strArr);
        for (String a : answerArr) {
            System.out.println(a);
        }
    }

    public ArrayList<String> solution1(int n, String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();
        for (String str : strArr) {
            String reversedStr = new StringBuilder(str).reverse().toString();
            answer.add(reversedStr);
        }
        return answer;
    }

    public ArrayList<String> solution2(int n, String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();
        for(String str : strArr) {
            char[] charArray = str.toCharArray();
            int lt = 0, rt = str.length() - 1;
            while (lt < rt) {
                char tmp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = tmp;
                lt++;
                rt--;
            }
            String reversedStr = String.valueOf(charArray); // * 배열 -> 문자열로
            System.out.println(reversedStr);
        }
        return answer;
    }


}
