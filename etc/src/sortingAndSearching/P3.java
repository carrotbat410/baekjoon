package sortingAndSearching;

//문제명: 삽입 정렬

import java.util.Scanner;

class P3 {
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
        for(int i=1; i<n; i++){
            int tmp=arr[i], j;
            for(j=i-1; j>=0; j--){
                if(arr[j]>tmp) arr[j+1]=arr[j];
                else break;
            }
            arr[j+1]=tmp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
