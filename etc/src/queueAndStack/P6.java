package queueAndStack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//문제명: 공주 구하기
//* Queue는 Queue<Integer> queue = new LinkedList<>(); 이렇게 만듦.
//* queue.offer, queue.pull
class P6 {
    public static void main(String[] args) {
        //스캐너로 받을시
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        kb.nextLine();
//8 3
        solution(n, k); //7
    }

    public static void solution(int n, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) queue.offer(i);

        while(!queue.isEmpty()) {
            for (int i = 1; i < k; i++) queue.offer(queue.poll());
            queue.poll();
            if(queue.size() == 1) answer = queue.poll();
        }
        System.out.println(answer);
    }

}
