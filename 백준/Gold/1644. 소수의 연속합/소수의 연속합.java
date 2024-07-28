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
        solution(n);
    }
    public static void solution(int num) {
        int answer = 0;
        List<Integer> arr = sieveOfEratosthenes(num);

        int lt = 0;
        int len = arr.size();
        int sum = 0;
        for(int rt = 0; rt < len; rt++) {
            sum += arr.get(rt);
            if(sum == num) answer++;
            else if(sum > num) {

                while(sum - arr.get(lt) >= num) sum = sum - arr.get(lt++);

                if(sum == num) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }

    public static List<Integer> sieveOfEratosthenes(int num) {
        ArrayList<Integer> onlyPrimes = new ArrayList<>();
        int[] arr = new int[num + 1];

        for(int i = 2; i <= num; i++) {
            if(arr[i] == 0) {
                arr[i] = 1;
                onlyPrimes.add(i);
                for (int j = i; j <= num; j = j + i) arr[j] = 1;
            }
        }

        return onlyPrimes;
    }


}