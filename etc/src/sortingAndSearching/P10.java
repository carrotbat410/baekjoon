package sortingAndSearching;

//문제명: 마구간 정하기(결정알고리즘)
import java.util.Arrays;
import java.util.Scanner;

class P10 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int c = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
//5 3
//1 2 8 4 9
        solution(n, c, arr); //3
    }

    public static void solution(int n, int c, int[] arr) {
        Arrays.sort(arr);
        int answer = 0;
        int lt = 1;
        int rt = arr[n - 1] - arr[0];
        while(lt <= rt) {
            int mid = (lt + rt) / 2;
            int cnt = counter(c, mid, arr);
            if(cnt > 0) rt = mid - 1;
            else {
                lt = mid + 1;
                answer = mid;
            }
        }

        System.out.println(answer);
    }

    public static int counter(int c, int dis, int[] arr) {
        int horseCnt = c - 1;
        int pos = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(horseCnt == 0) break;
            if(arr[i] - pos >= dis) {
                horseCnt--;
                pos = arr[i];
            }
        }

        return horseCnt;
    }

}
