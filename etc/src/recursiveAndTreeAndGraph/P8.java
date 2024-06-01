package recursiveAndTreeAndGraph;

//문제명: 송아지 찾기(BFS : 상태트리탐색)

import java.util.*;

class P8 {
    static int[] dis = {1, -1, 5};
    static int[] ch;
    static Queue<Integer> Q = new LinkedList<>();

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int e = kb.nextInt();

        BFS(s, e);
    }

    public static void BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if(nx == e) {
                        System.out.println(L + 1);
                        return;
                    }else {
                        if(nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                            ch[nx] = 1;
                            Q.offer(nx);
                        }
                    }
                }
            }
            L++;
        }
    }



}
