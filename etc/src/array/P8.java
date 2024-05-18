package array;
//!제출시 패키지명 제거, 클래스명 Main으로

//문제명: (같은 점수는 공동 순위인) 등수구하기

import java.util.Scanner;

class P8 {
    public static void main(String[] args) {

        //스캐너로 받을시
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        //직접 입력
//        int n = 5;
//        int[] arr = {87, 89, 92, 100, 76};

        solution(n, arr); // 4 3 2 1 5
    }

    public static void solution(int n, int[] arr) {
        String answerStr = "";
        int grade = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i] < arr[j]) grade++;
            }
            answerStr += grade + " ";
            grade = 1;
        }
        System.out.println(answerStr);
    }

}
