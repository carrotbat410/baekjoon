package sortingAndSearching;

//문제명: Least Recently Used

import java.util.Scanner;

class P4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int size = kb.nextInt();
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
//5 9
//1 2 3 2 6 2 3 5 7
        solution(size, n, arr); //5 6 7 9 10 11
    }

    public static void solution(int size, int n, int[] arr) {
        int[] cache = new int[size];
        for (int x : arr) {
            int idx = -1;
            for(int i = 0; i < size; i++) {
                if(cache[i] == x) {
                    idx = i;
                    break;
                }
            }
            if (idx == -1) { // cache miss
                for (int i = size - 1; i >= 1; i--) cache[i] = cache[i - 1];
            } else { // cache hit
                for (int i = idx; i >= 1; i--) cache[i] = cache[i - 1];
            }
            cache[0] = x;
        }

        for (Integer tmp : cache) System.out.print(tmp + " ");
    }

}
