package recursiveAndTreeAndGraph;

//문제명: 피보나치 수열

import java.util.Scanner;
//! 재귀는 for문에 비해 스택프레임 도니까 메모리 낭비도 많이 일어나고 무거움
//! 재귀할떄 왠만하면 메모이제이션 사용하기

class P4 {
    public static int[] fibo;
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.nextLine();
        fibo = new int[n + 1];
        fibo[1] = 1;
        fibo[2] = 1;
        DFS(n);
        for(int i = 1; i <= n; i++) System.out.print(fibo[i] + " ");
    }


    public static int DFS(int n) {
        if(fibo[n] != 0) return fibo[n];
        if(n == 1) return 1;
        else if(n == 2) return 1;
        else {
            return fibo[n] = DFS(n - 2) + DFS(n - 1);
        }
    }
}
