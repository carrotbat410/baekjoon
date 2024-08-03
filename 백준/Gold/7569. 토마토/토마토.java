import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//! 백준 문제풀이용 템플릿

class RipeTomato {
    int x;
    int y;
    int z;
    public RipeTomato(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
    static int[] dz = {-1, 1};


    static int m;
    static int n;
    static int h;
    static int[][][] box;
    static LinkedList<RipeTomato> queue = new LinkedList<>();
    static int ripeTomatoCnt = 0;
    static int rawTomatoCnt = 0;
    static int totalTomatoCnt = 0;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        box = new int[h][n][m];

        for(int i = 0; i < h; i++) {
            int[][] board = new int[n][m];
            for(int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                int[] row = new int[m];
                for(int k = 0; k < m; k++) {
                    int tmp = Integer.parseInt(st.nextToken());
                    row[k] = tmp;
                    if(tmp == 0) {
                        rawTomatoCnt++;
                        totalTomatoCnt++;
                    }else if(tmp == 1) {
                        ripeTomatoCnt++;
                        totalTomatoCnt++;
                        RipeTomato ripeTomato = new RipeTomato(k, j, i);
                        queue.offer(ripeTomato);
                    }
                }
                board[j] = row;
            }
            box[i] = board;
        }

        //모든 토마토가 익어있는 상태인 경우
        if(totalTomatoCnt == ripeTomatoCnt) {
            System.out.println(0);
            return;
        }

        BFS();
        //토마토가 모두 익지는 못하는 상황
        if(rawTomatoCnt > 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(answer - 1);
    }

    public static void BFS() {
        int L = 0;
        while(!queue.isEmpty()) {
//            System.out.println("L:"+L + ",  queue = " + queue);
            int len = queue.size();
            for(int i = 0; i < len; i++) {
                RipeTomato poll = queue.poll();

                for(int j = 0; j < 2; j++) {
                    int nz = poll.z + dz[j];
                    if(nz >= 0 && nz < h && box[nz][poll.y][poll.x] == 0) {
                        box[nz][poll.y][poll.x] = 1;
                        findRawTomato();
                        queue.offer(new RipeTomato(poll.x, poll.y, nz));
                    }
                }


                for(int j = 0; j < 4; j++) {
                    int nx = poll.x + dx[j];
                    int ny = poll.y + dy[j];
                    if(nx >= 0 && nx <m && ny >= 0 && ny < n && box[poll.z][ny][nx] == 0) {
                        box[poll.z][ny][nx] = 1;
                        findRawTomato();
                        queue.offer(new RipeTomato(nx, ny, poll.z));
                    }
                }
            }

            L++;
        }
        answer = L;
    }

    public static void findRawTomato() {
        ripeTomatoCnt++;
        rawTomatoCnt--;
    }

}

