package array;
//!제출시 패키지명 제거, 클래스명 Main으로

//문제명: 임시반장 정하기

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class P11 {
    public static void main(String[] args) {

        //스캐너로 받을시
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][5];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
//5
//2 3 1 7 3
//4 1 9 6 8
//5 5 2 4 4
//6 5 2 6 7
//8 4 2 2 2
        solution(n, arr); //4
    }

    public static void solution(int n, int[][] arr) {
        int answer = 0;
        int max = 0;
        HashMap<String, Integer> map = new HashMap<>();




    }

}
