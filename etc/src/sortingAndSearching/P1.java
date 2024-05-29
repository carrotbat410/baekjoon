package sortingAndSearching;

//문제명: 선택 정렬

import java.util.Scanner;

class P1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
//6
//13 5 11 7 23 15
        solution(n, arr); //5 7 11 13 15 23
    }

    public static void solution(int n, int[] arr) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if(arr[j] < arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
            answer.append(arr[i] + " ");
        }
        answer.append(arr[n - 1]);
        System.out.println(answer);
    }

}
