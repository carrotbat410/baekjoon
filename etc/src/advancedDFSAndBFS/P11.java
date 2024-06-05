package advancedDFSAndBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//문제명: 미로의 최단거리 통로(BFS)
public class P11 {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
    static int[][] board;
    static int answer = 0;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        board = new int[8][8];
        for(int i = 1; i <= 7; i++) {
            for(int j = 1; j <= 7; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        board[1][1] = 1;
        BFS(1, 1);

        if(answer == 0) System.out.println(-1);
        else System.out.println(answer);
    }

    public static void BFS(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y, 0));
        board[y][x] = 1;
        while(!queue.isEmpty()) {
            Point tmp = queue.poll();
            for(int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                int nL = tmp.L + 1;
                if(nx >= 1 && ny >= 1 && nx <= 7 && ny <= 7 && board[ny][nx] == 0) {
                    if(nx == 7 && ny == 7) answer = nL;
                    board[ny][nx] = 1;
                    queue.offer(new Point(nx, ny, nL));
                }
            }
        }

    }

}
class Point {
    public int x, y, L = 0;
    public Point(int x, int y, int L) {
        this.x = x;
        this.y = y;
        this.L = L;
    }
}
