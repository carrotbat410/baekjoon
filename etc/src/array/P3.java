package array;
//!제출시 패키지명 제거, 클래스명 Main으로

import java.util.ArrayList;
import java.util.Scanner;

//문제명: 가위1바위2보3

class P3 {
    public static void main(String[] args) {

        //스캐너로 받을시
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];
        for(int i=0; i<n; i++) arrA[i]=kb.nextInt();
        for(int i=0; i<n; i++) arrB[i]=kb.nextInt();


        //직접 입력
//        int n = 5;
//        int[] arrA = {2,3,3,1,3};
//        int[] arrB = {1,1,2,2,3};
        solution(n, arrA, arrB);
    }

    public static void solution(int n, int[] arrA, int[] arrB) {
        ArrayList<String> answer = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int a = arrA[i];
            int b = arrB[i];
            if(a == b) answer.add("D");
            else if(a == 1 && b == 3) answer.add("A");
            else if(a == 2 && b == 1) answer.add("A");
            else if(a == 3 && b == 2) answer.add("A");
            else answer.add("B");
        }
        answer.forEach(s-> System.out.println(s));

    }

}
