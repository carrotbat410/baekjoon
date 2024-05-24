package twoPointersAndSlidingWindow;

import java.util.Scanner;

//문제명: 최대 길이 연속부분수열

class P6 {
    public static void main(String[] args) {
        //스캐너로 받을시
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
//14 2
//1 1 0 0 1 1 0 1 1 0 1 1 0 1
        solution(n,k, arr); //8
    }

    public static void solution(int n, int k, int[] arr) {
        int answer = 0;
        int lt = 0;
        int cnt = 0;
        for(int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0) cnt++;
            while (cnt > k) {
                if(arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        System.out.println(answer);
    }


}
