package sortingAndSearching;

//문제명: 뮤직비디오(결정알고리즘)
import java.util.Arrays;
import java.util.Scanner;

class P9 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
//9 3
//1 2 3 4 5 6 7 8 9
        solution(n, m, arr); //17
    }

    public static void solution(int n, int m, int[] arr) {
        int answer = 1001;
        int lt = Arrays.stream(arr).max().getAsInt(); //OptionalInt->기본형 int로 바꿔야함
        int rt = Arrays.stream(arr).sum();
        while (lt <= rt) {
            int mid = (lt + rt) / 2; //tmp size
            int cnt = counter(mid, arr);
            if(cnt > m) lt = mid + 1;
            else {
                answer = mid;
                rt = mid + -1;
            }
        }
        System.out.println(answer);
    }

    public static int counter(int size, int[] arr) {
        int cnt = 1;
        int tmpSum = 0;
        for (int x : arr) {
            if(tmpSum + x > size) {
                cnt++;
                tmpSum = x;
            }else tmpSum += x;
        }
        return cnt;
    }

}
