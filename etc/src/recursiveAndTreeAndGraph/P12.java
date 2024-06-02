package recursiveAndTreeAndGraph;

//문제명: 경로 탐색(인접리스트)
//! 인접 행렬은 정점이 많을수록 느려짐 => 만약 n이 10000이면, graph 10000 x 10000 필요하고(메모리 소모), for문도 길어짐.
//! 따라서, 인접리스트가 효울적이다.
import java.util.*;

class P12 {
    static int n;
    static int m;
    static int answer;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        ch = new int[n + 1];
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<Integer>());
        for (int i = 0; i < m; i++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        DFS(1);
        System.out.println(answer); //6
    }

    public static void DFS(int v){
        if(v == n) answer++;
        else {
            for(int nv: graph.get(v)) {
                if(ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

}
