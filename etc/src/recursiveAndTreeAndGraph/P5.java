package recursiveAndTreeAndGraph;

//문제명: 이진트리 순회(깊이우선탐색)

/**
 *         1
*       2     3
 *    4  5   6  7
 */
//전위순회 (부왼오) : 1 2 4 5 3 6 7
//중위순회 (왼부오) : 4 2 5 1 6 3 7
//후위순회 (왼오부) : 4 5 2 6 7 3 1

//* 풀이 1 노드 이용
class Node {
    int data;
    Node lt = null;
    Node rt = null;
    public Node(int data) {
        this.data = data;
    }
}

class P5 {
    Node root;
    public void DFS(Node root){
        if(root==null) return;
        else{
            System.out.print(root.data+" ");
            DFS(root.lt);
            DFS(root.rt);
        }
    }
    public static void main(String args[]) {
        P5 tree = new P5();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }

}


//* 풀이 2
//class P5 {
//    static int n = 0;
//    public static void main(String[] args) {
//        Scanner kb = new Scanner(System.in);
//        n = kb.nextInt();
//        kb.nextLine();
//        DFS(1);
//    }
//
//
//    public static void DFS(int L) {
//        if(L > n) return;
//        else {
//            DFS(2 * L);
//            System.out.print(L + " ");
//            DFS(2 * L + 1);
//        }
//    }
//}