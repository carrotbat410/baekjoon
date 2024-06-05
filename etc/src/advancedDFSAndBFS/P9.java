package advancedDFSAndBFS;

import java.util.Scanner;

//문제명: 조합 구하기
public class P9 {
    static int n, m = 0;
    static int[] tmp;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        tmp = new int[m];

        DFS(0, 1);
    }

    public static void DFS(int L, int s) {
        if(L == m) {
            for (int x : tmp) System.out.print(x + " ");
            System.out.println();
        }else {
            for (int i = s; i <= n; i++) {
                tmp[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

}
