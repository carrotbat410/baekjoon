package advancedDFSAndBFS;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//문제명: 중복순열 구하기
public class P5 {
    static int n, m = 0;
    static int answer = Integer.MAX_VALUE;
    static Integer[] arr; //! reverseOrder 사용하려면, 기본형 X

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        arr = new Integer[n];
        for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
        Arrays.sort(arr, Collections.reverseOrder()); //! [1, 3, 5] 보다 [5, 3, 1]로 하는게 더 효율적임.
        m = kb.nextInt();

        DFS(0, 0);
        System.out.println(answer);
    }

    public static void DFS(int L, int sum) {
        if(L >= answer) return;
        if(sum > m) return;
        if(sum == m) {
            answer = Math.min(answer, L);
        }else {
            for(int i = 0; i < n; i++) {
                DFS(L + 1, sum + arr[i]);
            }
        }
    }
}
