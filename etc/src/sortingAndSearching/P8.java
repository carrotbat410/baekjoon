package sortingAndSearching;

//문제명: 이분검색
import java.util.Arrays;
import java.util.Scanner;

class P8 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
//8 32
//23 87 65 12 57 32 99 81
        binarySearch(n, m, arr); //3
    }

    public static void binarySearch(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0;
        int rt = n - 1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if(arr[mid] == m) {
                answer = mid + 1;
                break;
            }
            if(arr[mid] > m) rt = mid - 1;
            else lt = mid + 1;
        }
        System.out.println(answer);
    }

}
