package recursiveAndTreeAndGraph;

//문제명: 경로 탐색(인접행렬)

import java.util.Scanner;

class P11 {
    static int n;
    static int m;
    static int answer;
    static int[][] graph;
    static int[] ch;


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new int[n + 1][n + 1];
        ch = new int[n + 1];

        for(int i = 0; i < m; i++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        DFS(1);
        System.out.println(answer); //6
//5 9
//1 2
//1 3
//1 4
//2 1
//2 3
//2 5
//3 4
//4 2
//4 5
    }

    public static void DFS(int v){
        if(v == n) answer++;
        else{
            for(int i = 1; i <= n; i++){
                if(graph[v][i] == 1 && ch[i] == 0){
                    ch[i]=1;
                    DFS(i);
                    ch[i]=0;
                }
            }
        }
    }



}
