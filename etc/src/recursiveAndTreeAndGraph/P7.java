package recursiveAndTreeAndGraph;

//문제명: 이진트리 순회(BFS)

import java.util.LinkedList;
import java.util.Queue;

class Node7 {
    int data;
    Node7 lt;
    Node7 rt;
    public Node7(int data) {
        this.data = data;
    }

}

class P7 {

    Node7 root;
    public static void main(String[] args) {
        P7 tree = new P7();
        tree.root = new Node7(1);
        tree.root.lt = new Node7(2);
        tree.root.rt = new Node7(3);
        tree.root.lt.lt = new Node7(4);
        tree.root.lt.rt = new Node7(5);
        tree.root.rt.lt = new Node7(6);
        tree.root.rt.rt = new Node7(7);

        BFS(tree.root);
    }

    public static void BFS(Node7 root){
        Queue<Node7> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            System.out.print(L + " : ");
            for(int i = 0; i < len; i++) {
                Node7 cur = queue.poll();
                System.out.print(cur.data + " ");
                if(cur.lt != null) queue.offer(cur.lt);
                if(cur.rt != null) queue.offer(cur.rt);
            }
            L++;
            System.out.println();
        }

    }

}
