import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
        int x = kb.nextInt();
        solution(n, arr, x);
    }
    public static void solution(int n, int[] arr, int x) {
        int anawer = 0;
        Arrays.sort(arr);
        int lt = 0;
        int rt = n - 1;
        while (lt < rt) {
            int sum = arr[lt] + arr[rt];
            if(sum == x) {
                lt++;
                rt--;
                anawer++;
            }else if(sum > x) rt--;
            else lt++;
        }
        System.out.println(anawer);
    }

}