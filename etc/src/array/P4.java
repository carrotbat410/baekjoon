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
        solution(n); // 1 1 2 3 5 8 13 21 34 55
    }

    public static void solution(int n) {
        System.out.print(1 + " " + 1);
        int cnt = 2;
        int tmp1 = 1;
        int tmp2 = 1;
        while (cnt < n) {
            int tmpSum = tmp1 + tmp2;
            System.out.print(" "+ tmpSum);
            tmp1 = tmp2;
            tmp2 = tmpSum;
            cnt++;
        }

    }

}
