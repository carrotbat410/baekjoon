package recursiveAndTreeAndGraph;

//문제명: 부분집합 구하기(DFS)

class P6 {
    static int n = 0;
    static int[] ch;
    public static void main(String args[]) {
        n = 3;
        ch = new int[n + 1];
        DFS(1);
    }

    public static void DFS(int L){
        if(L == n + 1) {
            String str = "";
            for(int i = 0; i <= n ; i++) if(ch[i] != 0) str += i + " ";
            if(str.length() > 0) System.out.println(str);
        } else {
            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L + 1);
        }
    }


}
