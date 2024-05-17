package array;
//!제출시 패키지명 제거, 클래스명 Main으로

import java.util.ArrayList;
import java.util.Scanner;

//문제명: 피보나치 수열

class P4 {
    public static void main(String[] args) {

        //스캐너로 받을시
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();

        //직접 입력
        int n = 10;
        solution2(n);
    }

    public static void solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        String answerStr = "1 1 ";
        answer.add(1);
        answer.add(1);
        for (int i = 2; i < n; i++) {
            int sum = answer.get(i - 1) + answer.get(i - 2);
            answer.add(sum);
            answerStr += sum + " ";
        }
        System.out.println(answerStr);
    }

    //조간: 배열 쓰지 말고 변수3개로
    public static void solution2(int n) {
        String answerStr = "1 1 ";
        int a = 1;
        int b = 1;
        for(int i = 2; i < n; i++) {
            int c = a + b;
            answerStr += c + " ";
            a = b;
            b = c;
        }
        System.out.println(answerStr);
    }

}
