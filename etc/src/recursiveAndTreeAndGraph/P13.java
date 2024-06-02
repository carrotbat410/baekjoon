package recursiveAndTreeAndGraph;

//문제명: 그래프 최단거리(BFS)
//! 인접 행렬은 정점이 많을수록 느려짐 => 만약 n이 10000이면, graph 10000 x 10000 필요하고(메모리 소모), for문도 길어짐.
//! 따라서, 인접리스트가 효울적이다.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class P13 {
    static int n;
    static int m;
    static int answer;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    static int[] dis;


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();

        ch = new int[n + 1];
        dis = new int[n + 1];

        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<Integer>());
        for (int i = 0; i < m; i++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        BFS(1);
//6 9
//1 3
//1 4
//2 1
//2 5
//3 4
//4 5
//4 6
//6 2
//6 5
        for (int i = 2; i <= n; i++) System.out.println(i + " : " + dis[i]);
    }

    public static void BFS(int v){
        ch[v] = 1;
        dis[v] = 0;
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(v);
        while (!Q.isEmpty()) {
            int cv = Q.poll();
            for (int nv: graph.get(cv)) {
                if(ch[nv] == 0) {
                    ch[nv] = 1;
                    Q.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }

}
