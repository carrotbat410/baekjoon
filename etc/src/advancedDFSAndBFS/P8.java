package advancedDFSAndBFS;

import java.util.Scanner;

//문제명: 수열 추측하기
//! 맨 첫째줄에 1 ~ N까지의 순열을 구하면 되는 문제
// 또한 순열은 ch 필요함.
public class P8 {
    static int n, f = 0;
    static int[] b, p, ch;
    static boolean flag = false;
    static int[][] memo;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        f = kb.nextInt();
        b = new int[n];
        p = new int[n];
        ch = new int[n + 1];
        memo = new int[n + 1][n + 1];

        for(int i = 0; i < n; i++) {
            b[i] = combi(n - 1, i);
        }

        DFS(0, 0);
    }

    public static void DFS(int L, int sum) {
        if(flag) return;
        if(L == n) { // 순열 완성
            if(sum == f){
                for(int x : p) System.out.print(x + " ");
                flag = true;
            }
        }else {
            for(int i = 1; i <= n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L + 1, sum + (p[L] * b[L]));
                    ch[i] = 0;
                }
            }
        }
    }

    private static int combi(int n, int r) {
        if(memo[n][r]>0) return memo[n][r];
        if(n==r || r==0) return 1;
        else return memo[n][r]=combi(n-1, r-1)+combi(n-1, r);
    }

}
