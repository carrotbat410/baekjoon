import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//! 백준 문제풀이용 템플릿

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());

        solution(Math.min(a, b), Math.max(a, b));
    }
    public static void solution(long a, long b) {
        double avg = (double) (a + b) / 2;
        long n = b - a + 1;
        double answer = avg * n;
        if (answer == (long) answer) System.out.println((long) answer);
        else System.out.println(answer);
    }

}
