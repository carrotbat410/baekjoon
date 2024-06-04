package advancedDFSAndBFS;

import java.util.Scanner;

//문제명: 순열 구하기
public class P6 {
    static int n, m = 0;
    static int[] arr;
    static int[] tmp;
    static int[] ch;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
        tmp = new int[m];
        ch = new int[n];

        DFS(0);
    }

    public static void DFS(int L) {
        if(L == m) {
            for (int x : tmp) System.out.print(x + " ");
            System.out.println();
        } else {
            for(int i = 0; i < n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    tmp[L] = arr[i];
                    DFS(L+1);
                    ch[i] = 0;
                }
            }
        }
    }

}
