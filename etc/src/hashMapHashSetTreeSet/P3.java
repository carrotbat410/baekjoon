package hashMapHashSetTreeSet;

import java.util.HashMap;
import java.util.Scanner;

//문제명: 매출액의 종류

class P3 {
    public static void main(String[] args) {
        //스캐너로 받을시
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
//7 4
//20 12 20 10 23 17 10
        solution(n, k, arr); //3 4 4 3
    }

    //! answer String으로 만들면 새로운 문자열 객체를 생성하므로, StringBuilder 사용하기!
    public static void solution(int n, int k, int[] arr) {
        StringBuilder answer = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<k-1; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        int lt = 0;
        for(int rt=k-1; rt<n; rt++){
            map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
            answer.append(map.size()).append(" ");
            map.put(arr[lt], map.get(arr[lt])-1);
            if(map.get(arr[lt])==0) map.remove(arr[lt]);
            lt++;
        }
        System.out.println(answer);
    }

    //! Set이용: 비효율적임. timeOut
//    public static void solution2(int n, int k, int[] arr) {
//        String answer = "";
//        for (int i = 0; i < n - k + 1; i++) {
//            HashSet<Integer> set = new HashSet<>();
//            for(int j = 0; j < k; j++) {
//                set.add(arr[i + j]);  이부분이 비효율적
//            }
//            answer += set.size() + " ";
//        }
//        System.out.println(answer);
//    }


}
