package advancedDFSAndBFS;


import java.util.Scanner;

//문제명: 중복순열 구하기
public class P4 {
    static int n, m = 0;
    static int[] tmp;


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt(); // 3
        m = kb.nextInt(); // 2
        tmp = new int[m];

        DFS(0);
    }

    public static void DFS(int L) {
        if(L==m){
            for(int x : tmp) System.out.print(x+" ");
            System.out.println();
        }
        else{
            for(int i=1; i<=n; i++){ //! 두 가닥으로 뻗는게 아니라, n개로 뻗는게(for문 사용) 차이점
                tmp[L]=i;
                DFS(L+1);
            }
        }
    }
}
