package queueAndStack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//문제명: 교육과정 설계
//* Queue는 Queue<Integer> queue = new LinkedList<>(); 이렇게 만듦.
//* queue.offer, queue.pull
class P7 {
    public static void main(String[] args) {
        //스캐너로 받을시
        Scanner kb = new Scanner(System.in);
        String need = kb.nextLine();
        String plan = kb.nextLine();
//CBA
//CBDAGE
        System.out.println(solution(need, plan)); //YES
    }

    public static String solution(String needs, String plan) {
        Queue<Character> queue = new LinkedList<>();
        for(char need: needs.toCharArray()) queue.add(need);

        for(char x: plan.toCharArray()) {
            if(queue.contains(x)) {
                if(x != queue.poll()) return "NO";
            }
        }
        if(!queue.isEmpty()) return "NO";
        return "YES";
    }

}
