package twoPointersAndSlidingWindow;

import java.util.*;

//문제명: 두 배열 합치기

class P1 {
    public static void main(String[] args) {
        //스캐너로 받을시
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = kb.nextInt();
        }

        int m = kb.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = kb.nextInt();
        }

        solution(n,m,arr1,arr2);
    }

    public static void solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while(p1 < n && p2 < m) {
            if(arr1[p1] > arr2[p2]) answer.add(arr2[p2++]);
            else {
                answer.add(arr1[p1++]);
            }
        }
        while (p1 < n) answer.add(arr1[p1++]);
        while (p2 < m) answer.add(arr2[p2++]);

        String answerStr = "";
        for (Integer a : answer) answerStr += a + " ";
        System.out.println(answerStr);
    }


}
