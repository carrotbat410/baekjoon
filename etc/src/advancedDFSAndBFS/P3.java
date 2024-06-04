package advancedDFSAndBFS;


import java.util.Scanner;

//문제명: 최대점수 구하기(DFS)
public class P3 {
    static int answer = 0;
    static int n, m = 0;
    static int[] scores;
    static int[] times;


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        scores = new int[n];
        times = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = kb.nextInt();
            times[i] = kb.nextInt();
        }

        DFS(0, 0, 0);
        System.out.println(answer);
    }

    public static void DFS(int L, int score, int time) {
        if(time > m) return;
        if(L == n) {
            answer = Math.max(score, answer);
        }else {
            DFS(L + 1, score + scores[L], time + times[L]);
            DFS(L + 1, score, time);
        }
    }
}
