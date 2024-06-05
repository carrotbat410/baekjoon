package advancedDFSAndBFS;

import java.util.Scanner;

//문제명: 섬나라 아일랜드(DFS)
public class P13 {
    static int n = 0;
    static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[][] board;
    static int answer = 0;

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
                    DFS(x, y);
                    answer++;
                }
            }
        }
        System.out.println(answer); //5
    }

    public static void DFS(int x, int y) {
        board[y][x] = 0;

        for(int k = 0; k < 8; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];

            if(nx >= 0 && ny >= 0 && nx < n && ny < n && board[ny][nx] == 1) {
                DFS(nx, ny);
            }
        }
    }

}
