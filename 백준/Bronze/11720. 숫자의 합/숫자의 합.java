import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();

        int answer = 0;
        for (char c : str.toCharArray()) answer += Integer.parseInt(String.valueOf(c));

        System.out.println(answer);
    }

}
