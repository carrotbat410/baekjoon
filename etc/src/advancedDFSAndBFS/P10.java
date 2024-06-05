package advancedDFSAndBFS;

import java.util.Scanner;

//문제명: 미로탐색(DFS)
public class P10 {
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
        DFS(1, 1);
        System.out.println(answer);
    }

    public static void DFS(int x, int y) {
        if(x == 7 && y == 7) answer++;
        else {
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 1 && ny >= 1 && nx <= 7 && ny <= 7 && board[ny][nx] == 0) {
                    board[ny][nx] = 1;
                    DFS(nx, ny);
                    board[ny][nx] = 0;
                }
            }
        }
    }

}
