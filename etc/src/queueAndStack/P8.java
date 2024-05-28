package queueAndStack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//문제명: 응급실
class P8 {
    public static void main(String[] args) {
        //스캐너로 받을시
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
//5 2
//60 50 70 80 90
        System.out.println(solution(n, m, arr)); //3

//6 3
//70 60 90 60 60 60
//        System.out.println(solution(n, m, arr)); //4
    }

    public static int solution(int n, int m, int[] arr) {
        class Person {
            int id;
            int level;
            Person(int id, int level) {
                this.id = id;
                this.level = level;
            }
        }

        int answer = 0;
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) queue.offer(new Person(i, arr[i]));
        while (!queue.isEmpty()) {
            Person tmp = queue.poll();
            for(Person x: queue) {
                if(x.level > tmp.level) {//더 위급한사람 있으면
                    queue.offer(tmp); //다시 넣기
                    tmp = null;
                    break;
                }
            }

            if(tmp != null) { //여기 통과했다는건 더 위급한 사람 없다는 뜻
                answer++;
                if(tmp.id == m) return answer;
            }
        }
        return answer;
    }


}
