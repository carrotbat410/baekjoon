package recursiveAndTreeAndGraph;

//문제명: Tree 말단 노드까지의 가장 짧은 경로 (DFS)
//! 최단거리기이기 떄문에 BFS가 더 올바름.
//! DFS로 풀거면 자식 노드가 아예 없거나, 둘다 있어야함

import java.util.*;

class Node9 {
    int data;
    Node9 lt;
    Node9 rt;
    public Node9(int data) {
        this.data = data;
    }

}

class P9 {

    Node9 root;
    public static void main(String[] args) {
        P9 tree = new P9();
        tree.root = new Node9(1);
        tree.root.lt = new Node9(2);
        tree.root.rt = new Node9(3);
        tree.root.lt.lt = new Node9(4);
        tree.root.lt.rt = new Node9(5);

        System.out.println(DFS(0, tree.root));
    }

    public static int DFS(int L, Node9 root){
        if(root.lt == null && root.rt == null) return L;
        else return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
    }

}
