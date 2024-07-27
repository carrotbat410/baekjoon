package recursiveAndTreeAndGraph;

//문제명: 그래프 최단거리(BFS)
//! 인접 행렬은 정점이 많을수록 느려짐 => 만약 n이 10000이면, graph 10000 x 10000 필요하고(메모리 소모), for문도 길어짐.
//! 따라서, 인접리스트가 효울적이다.

import java.util.*;

//내 풀이
public class P13 {
    static int n;
    static int m;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] ch;
    static int[] answer;
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();

        ch = new int[n + 1];
        answer = new int[n + 1];

        for(int i = 0; i <= n; i++) graph.add(new ArrayList<>());
        for(int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }

        BFS();
        answer[0] = 0;
        answer[1] = 0;
        for (int i : answer) {
            System.out.println(i);
        }
    }

    public static void BFS() {
        Queue<Integer> queue = new LinkedList<>();
        ch[1] = 1;
        queue.add(1);
        int L = 1;
        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i = 0; i < len; i++) { // 1 한번만
                int v = queue.poll();
                // 1과 연관되어있는 정점 queue에 넣기
                for (Integer nv : graph.get(v)) { // nv: [3, 4]
                    if(answer[nv] == 0) answer[nv] = L;
                    if(ch[nv] == 0) queue.offer(nv);
                }
            }
            L++;
        }
    }

}


//답
//class P13 {
//    static int n;
//    static int m;
//    static int answer;
//    static ArrayList<ArrayList<Integer>> graph;
//    static int[] ch;
//    static int[] dis;
//
//
//    public static void main(String[] args) {
//        Scanner kb = new Scanner(System.in);
//        n = kb.nextInt();
//        m = kb.nextInt();
//
//        ch = new int[n + 1];
//        dis = new int[n + 1];
//
//        graph = new ArrayList<ArrayList<Integer>>();
//        for (int i = 0; i <= n; i++) graph.add(new ArrayList<Integer>());
//        for (int i = 0; i < m; i++){
//            int a = kb.nextInt();
//            int b = kb.nextInt();
//            graph.get(a).add(b);
//        }
//        BFS(1);
////6 9
////1 3
////1 4
////2 1
////2 5
////3 4
////4 5
////4 6
////6 2
////6 5
//        for (int i = 2; i <= n; i++) System.out.println(i + " : " + dis[i]);
//    }
//
//    public static void BFS(int v){
//        ch[v] = 1;
//        dis[v] = 0;
//        Queue<Integer> Q = new LinkedList<>();
//        Q.offer(v);
//        while (!Q.isEmpty()) {
//            int cv = Q.poll();
//            for (int nv: graph.get(cv)) {
//                if(ch[nv] == 0) {
//                    ch[nv] = 1;
//                    Q.offer(nv);
//                    dis[nv] = dis[cv] + 1;
//                }
//            }
//        }
//    }
//
//}


