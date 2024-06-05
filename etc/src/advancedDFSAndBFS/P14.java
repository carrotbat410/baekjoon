package advancedDFSAndBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//문제명: 섬나라 아일랜드(BFS)
public class P14 {
    static int n = 0;
    static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[][] board;
    static int answer = 0;
    static Queue<Point14> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        board = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
            }
        }

        for(int y = 0; y < n; y++) {
            for(int x = 0; x < n; x++) {
                if(board[y][x] == 1) {
                    answer++;
                    board[y][x] = 0;
                    queue.offer(new Point14(x, y));
                    BFS();
                }
            }
        }

        System.out.println(answer); //5
    }

    public static void BFS() {
        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i = 0; i < len; i++) {
                Point14 tmp = queue.poll();
                for(int k = 0; k < 8; k++) {
                    int nx = tmp.x + dx[k];
                    int ny = tmp.y + dy[k];
                    if(nx >= 0 && ny >= 0 && nx < n && ny < n && board[ny][nx] == 1) {
                        board[ny][nx] = 0;
                        queue.offer(new Point14(nx, ny));
                    }
                }
            }
        }
    }

}

class Point14 {
    int x, y;
    Point14(int x, int y) {
        this.x = x;
        this.y = y;
    }
}