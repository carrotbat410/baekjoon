package recursiveAndTreeAndGraph;

//문제명: 재귀함수를 이용한 이진수 출력

class P2 {
    public static void main(String[] args) {
        DFS(11); //1011
    }

    public static void DFS(int n) {
        if(n == 0) return;
        else {
            DFS(n/2);
            System.out.print(n%2);
        }
    }

}
