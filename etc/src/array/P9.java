package array;
//!제출시 패키지명 제거, 클래스명 Main으로

//문제명: 격자판 최대합

import java.util.Scanner;

class P9 {
    public static void main(String[] args) {

        //스캐너로 받을시
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

//5
//10 13 10 12 15
//12 39 30 23 11
//11 25 50 53 15
//19 27 29 37 27
//19 13 30 13 19
        solution(n, arr);
    }

    public static void solution(int n, int[][] arr) {
        int max = 0;

        for (int i = 0; i < n; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j]; // 가로합 구하기
                sum2 += arr[j][i]; // 세로합 구하기
            }
            max = Math.max(max, sum1);
            max = Math.max(max, sum2);
        }

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i]; //11시 -> 5시
            sum2 += arr[n - i - 1][i]; //1시 -> 7시
        }
        max = Math.max(max, sum1);
        max = Math.max(max, sum2);

        System.out.println(max);
    }

}
