package array;
//!제출시 패키지명 제거, 클래스명 Main으로

//문제명: (연속 정답시 가산점붙는)점수계산

import java.util.Scanner;

class P7 {
    public static void main(String[] args) {

        //스캐너로 받을시
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        //직접 입력
//        int n = 10;
//        int[] arr = {1, 0, 1, 1, 1, 0, 0, 1, 1, 0};

        solution(n, arr);
    }

    public static void solution(int n, int[] arr) {
        int answer = 0;
        int acc = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0) acc = 0;
            else {
                acc++;
                answer += acc;
            }
        }
        System.out.println(answer);
    }

}
