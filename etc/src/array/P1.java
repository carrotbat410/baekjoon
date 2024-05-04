package array;

import java.util.ArrayList;
import java.util.Scanner;

//문제명: (자신의 앞 수 보다)큰 수만 출력하기

class P1 {
    public static void main(String[] args) {

        //스캐너로 받을시
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++){
//            arr[i]=kb.nextInt();
//        }

        //직접 입력
        int n = 6;
        int[] arr = {7, 3, 9, 5, 6, 12};

        System.out.println(solution(n, arr)); // 7 9 6 12
    }

    //* 람다 사용하면 코드 깔끔하게 풀수 있을거같은데 (성능은?)
    public static String solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>(); //TODO ArrayList<>(), ArrayList<Integer>()차이가 뭐지?
        answer.add(arr[0]);
        for(int i = 1; i < n; i++) {
            if(arr[i] > arr[i - 1]) answer.add(arr[i]);
        }

        String tmp = "";
        for (Integer a : answer) {
            tmp += a + " ";
        }
        return tmp;
    }

}
