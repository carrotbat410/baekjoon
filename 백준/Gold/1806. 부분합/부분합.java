import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//! 백준 문제풀이용 템플릿
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine()); //줄바꾸려면 st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        solution(n, s, arr);
    }
    public static void solution(int n, int s, int[] arr) {
        int answer = Integer.MAX_VALUE;

        int sum = 0;
        int lt = 0;
        for(int rt = 0; rt < n; rt++) {
            sum += arr[rt];

            while(sum - arr[lt] >= s ) sum -= arr[lt++];
            
            if(sum >= s) answer = Math.min(rt - lt + 1, answer);
        }

        if(answer == Integer.MAX_VALUE) answer = 0;
        System.out.println(answer);
    }

}