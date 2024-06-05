import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int m, n = 0;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
    static int[][] board;
    static int L = 0;
    static Queue<Point> queue = new LinkedList<>();

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
                if(board[y][x] == 1) queue.offer(new Point(x, y));
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
                Point tmp = queue.poll();
                for(int k = 0; k < 4; k++) {
                    int nx = tmp.x + dx[k];
                    int ny = tmp.y + dy[k];
                    if(nx >= 0 && ny >= 0 && nx < m && ny < n && board[ny][nx] == 0) {
                        board[ny][nx] = 1;
                        rawCnt--;
                        queue.offer(new Point(nx, ny));
                    }
                }
            }
            L++;
        }
    }

}
class Point {
    public int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
