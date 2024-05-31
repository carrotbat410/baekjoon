package recursiveAndTreeAndGraph;

//문제명: 팩토리얼

class P3 {
    //! n범위 커지면 BigInteger타입 사용해야함.
    public static void main(String[] args) {
        int answer = DFS(5); //5*4*3*2*1 => 120
        System.out.println("answer = " + answer);
    }

    public static int DFS(int n) {
        if(n == 1) return 1;
        else return n * DFS(n - 1);
    }
    /**
     * 5*DFS(4)₩
     *   4*DFS(3)
     *      3*DFS(2)
     *          2*DFS(1)
     *              1
     */

}
