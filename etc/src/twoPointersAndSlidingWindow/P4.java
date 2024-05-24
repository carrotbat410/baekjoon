package twoPointersAndSlidingWindow;

import java.util.Scanner;

//문제명: 연속 부분수열

class P4 {
    public static void main(String[] args) {
        //스캐너로 받을시
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = kb.nextInt();
        }

//8 6
//1 2 1 3 1 1 1 2

        solution(n, m, arr1);
    }

    public static void solution(int n, int m, int[] arr) {
        int answer = 0;
        int sum = 0;
        int lt = 0;
        for(int rt=0; rt<n; rt++){
            sum+=arr[rt];
            if(sum==m) answer++;
            while(sum>=m){
                sum-=arr[lt++];
                if(sum==m) answer++;
            }
        }

        System.out.println(answer);
    }


}
