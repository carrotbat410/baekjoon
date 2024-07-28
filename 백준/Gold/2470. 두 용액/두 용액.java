import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        solution(n, arr);
    }
    public static void solution(int n, int[] arr) {
        int answer1 = 0;
        int answer2 = 0;
        int answerSum = Integer.MAX_VALUE;

        int lt = 0;
        int rt = n - 1;
        while(lt < rt) {
            int sum = arr[lt] + arr[rt];
            int absSum = Math.abs(sum);

            if(absSum < answerSum) {
                answerSum = absSum;
                answer1 = arr[lt];
                answer2 = arr[rt];
            }

            if(sum > 0) rt--;
            else lt++;
        }
        System.out.println(answer1 + " " + answer2);
    }

}