package array;
//!제출시 패키지명 제거, 클래스명 Main으로

import java.util.Scanner;

//문제명: 소수(에라토스테네스 체)

class P5 {
    public static void main(String[] args) {

        //스캐너로 받을시
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();

        //직접 입력
        int n = 20;

        solution(n); //2, 3, 5, 7, 11, 13, 17, 19로 8개
    }

    public static void solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];
        for(int i = 2; i <= n; i++) {
            if(ch[i] == 0) {
                ch[i] = 1;
                answer++;
                for (int j = i; j <= n; j = j + i) {
                    if(ch[j] == 0) ch[j] = 1;
                }
            }
        }
        System.out.println(answer);
    }

}
