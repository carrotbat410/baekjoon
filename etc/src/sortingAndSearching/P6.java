package sortingAndSearching;

//문제명: 장난꾸러기
//문제의도: 정렬하면 쉽게 풀리는 문제도 있다.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class P6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
//9
//120 125 152 130 135 135 143 127 160
        solution(n, arr); //3 8
    }

    public static void solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for (int i = 0; i < n; i++) {
            if(tmp[i] != arr[i]) answer.add(i + 1);
        }

        for (Integer x : answer) System.out.print(x + " ");
    }

}
