package advancedDFSAndBFS;

import java.util.Scanner;

//문제명: 조합의 경우수(메모이제이션) nCr = n! / (n-r)r! 공식 사용하지 않고 계산해보아라.


/**
 * nCr = n-1Cr-1 + n-1Cr 인 이유
 * 1,2,3,4,5번 사람중에서 3명뽑는다 가정했을떄, 결과는 5번 사람이 들어갔을 경우, 안 들어갔을 경우로 나뉜다.
 * 5번 사람이 들어갔을 경우 => 4명중 2명만 더 뽑으면 됨. => 4C2
 * 5번 사람이 안 들어갔을 경우 => 4명중 3명 뽑아야 함. => 4C3
 * 즉, 5C3 = 4C2 + 4C3
 *
 */
public class P7 {
    static int n, r = 0;
    static int[][] memo;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        r = kb.nextInt();
        memo = new int[n + 1][n + 1];
        System.out.println(DFS(n, r));
    }

    public static int DFS(int n, int r) {
        if(memo[n][r] > 0) return memo[n][r];
        if(r == 0 || n == r) return 1;
        else {
            return memo[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
        }
    }

}
