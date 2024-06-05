package advancedDFSAndBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//문제명: 토마토
public class P12 {
    static int m, n = 0;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
    static int[][] board;
    static int L = 0;
    static Queue<Point12> queue = new LinkedList<>();

    static int rawCnt = 0;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        m = kb.nextInt();
        n = kb.nextInt();
        board = new int[n][m];

        for(int y = 0; y < n; y++) {
            for(int x = 0; x < m; x++) {
                board[y][x] = kb.nextInt();
                if(board[y][x] == 0) rawCnt++;
                if(board[y][x] == 1) queue.offer(new Point12(x, y));
            }
        }

        if(rawCnt == 0) {
            System.out.println(0);
            return;
        }

        BFS();
        if(rawCnt == 0) System.out.println(L - 1);
        else System.out.println(-1);
    }

    public static void BFS() {
        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i = 0; i < len; i++) {
                Point12 tmp = queue.poll();
                for(int k = 0; k < 4; k++) {
                    int nx = tmp.x + dx[k];
                    int ny = tmp.y + dy[k];
                    if(nx >= 0 && ny >= 0 && nx < m && ny < n && board[ny][nx] == 0) {
                        board[ny][nx] = 1;
                        rawCnt--;
                        queue.offer(new Point12(nx, ny));
                    }
                }
            }
            L++;
        }
    }

}
class Point12 {
    public int x, y;
    public Point12(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
