package array;
//!제출시 패키지명 제거, 클래스명 Main으로

//문제명: 뒤집은 소수

import java.util.Scanner;

class P6 {
    public static void main(String[] args) {

        //스캐너로 받을시
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        //직접 입력
//        int n = 9;
//        int[] arr = {32, 55, 62, 20, 250, 370, 200, 30, 100};

        solution(n, arr);
    }

    public static void solution(int n, int[] arr) {
        String answer = "";
        for (int tmp : arr) {
            int res = 0;

            //! StringBuilder 안쓰고 숫자 뒤집는 방법.
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if(isPrime(res)) answer += res + " ";
        }
        System.out.println(answer);
    }

    public static boolean isPrime(int num) {
        if(num < 2) return false;
        for(int i = 2; i < num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }

}
