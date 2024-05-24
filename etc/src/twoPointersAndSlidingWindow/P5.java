package twoPointersAndSlidingWindow;

import java.util.Scanner;

//문제명: 연속된 자연수의 합

class P5 {
    public static void main(String[] args) {
        //스캐너로 받을시
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt(); //15

        solution(n); //3
//        7+8=15
//        4+5+6=15
//        1+2+3+4+5=15
    }

    public static void solution(int n) {
        int answer = 0;
        int sum = 0;
        int lt = 1;
        for (int rt = 1; rt < n; rt++) {
            sum += rt;
            if(sum == n) answer++;
            else if(sum > n) {
                while (sum > n) {
                    sum -= lt++;
                    if(sum == n) answer++;
                }
            }
        }

        System.out.println(answer);
    }


}
