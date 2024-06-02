package recursiveAndTreeAndGraph;

//문제명: Tree 말단 노드까지의 가장 짧은 경로 (BFS)

import java.util.LinkedList;
import java.util.Queue;

class Node10 {
    int data;
    Node10 lt;
    Node10 rt;
    public Node10(int data) {
        this.data = data;
    }

}

class P10 {

    Node10 root;
    public static void main(String[] args) {
        P10 tree = new P10();
        tree.root = new Node10(1);
        tree.root.lt = new Node10(2);
        tree.root.rt = new Node10(3);
        tree.root.lt.lt = new Node10(4);
        tree.root.lt.rt = new Node10(5);

        System.out.println(BFS(tree.root));
    }

    public static int BFS(Node10 root){
        Queue<Node10> Q = new LinkedList<>();
        int L = 0;
        Q.offer(root);
        while(!Q.isEmpty()) {
            int len = Q.size();
            for(int i = 0; i < len; i++) {
                Node10 cur = Q.poll();
                if(cur.lt == null && cur.rt == null) return L;
                if(cur.lt != null) Q.offer(cur.lt);
                if(cur.rt != null) Q.offer(cur.rt);
            }
            L++;
        }
        return -1;
    }

}
