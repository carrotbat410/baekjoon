package advancedDFSAndBFS;


import java.util.Scanner;

//문제명: 바둑이 승차(DFS)
public class P2 {
    static int answer = 0;
    static int c, n = 0;
    static int[] arr;
    static boolean flag = false;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        c = kb.nextInt();
        n = kb.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        DFS(0, 0);
        System.out.println(answer);
    }

    public static void DFS(int L, int sum) {
        if(sum > c) return;
        if(flag) return;
        if(L == n) {
            answer = Math.max(sum, answer);
            if(answer == c) flag = true;
        }else {
            DFS(L + 1, sum + arr[L]);
            DFS(L + 1, sum);
        }
    }
}
