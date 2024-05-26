package hashMapHashSetTreeSet;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

//!문제명: K번째 큰 수 (TreeSet)
//* Collections.reverseOrder()
//* TreeSet.first, last, remove
// 기본 Set + 자동 정렬 기능


class P5 {
    public static void main(String[] args) {
        //스캐너로 받을시
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
//10 3
//13 15 34 23 45 65 33 11 26 42
        solution(n, k, arr); //143
    }
    public static void solution(int n, int k, int[] arr) {
        int answer=-1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int l=j+1; l<n; l++){
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }

        int cnt=0;
        for(int x : Tset){
            cnt++;
            if(cnt==k) {
                System.out.println(x);
                return;
            }
        }
        System.out.println(answer);
    }

}
