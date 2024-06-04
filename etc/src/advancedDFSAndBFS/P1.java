package advancedDFSAndBFS;


import java.util.Scanner;

//문제명: 합이 같은 부분집합(DFS : 아마존 인터뷰)
public class P1 {
    static String answer = "NO";
    static int n, total = 0;
    static int[] arr;
    static boolean flag = false;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
            total += arr[i];
        }

        DFS(0, 0);
        System.out.println(answer);
    }

    public static void DFS(int L, int sum) {
        if(flag) return;
        if(sum > (total - sum)) return;
        if(L == n) {
            if(sum == (total - sum) ) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(L + 1, sum + arr[L]);
            DFS(L + 1, sum);
        }
    }
}
