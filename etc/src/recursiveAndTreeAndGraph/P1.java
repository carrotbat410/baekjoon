package recursiveAndTreeAndGraph;

//문제명: 재귀함수

import java.util.Scanner;

class P1 {
    public static void main(String[] args) {
        DFS(3); //1 2 3
    }

    public static void DFS(int n) {
        if(n == 0) return;
        else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }

}
