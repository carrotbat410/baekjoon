package sortingAndSearching;

//문제명: 버블 정렬

import java.util.Scanner;

class P2 {
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
        for(int i = 0; i < n-1; i++) { //n - 1번 실행하면 정렬되어있음.
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
