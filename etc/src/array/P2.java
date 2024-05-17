package array;
//!제출시 패키지명 제거, 클래스명 Main으로

import java.util.*;

//문제명: 보이는 학생

class P2 {
    public static void main(String[] args) {

        //스캐너로 받을시
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }

        //직접 입력
//        int n = 8;
//        int[] arr = {130, 135, 148, 140, 145, 150, 150, 153};
        System.out.println(solution(n, arr));
    }

    public static int solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);

        int max = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
                answer.add(arr[i]);
            }
        }
        return answer.size();
    }

}
