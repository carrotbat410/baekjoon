package greedy;

//문제명: 최대 수입 스케쥴(PriorityQueue 응용문제)

import java.util.*;

class Lecture implements Comparable<Lecture> {
    public int money;
    public int date;
    public Lecture(int money, int date) {
        this.money = money;
        this.date = date;
    }
    @Override
    public int compareTo(Lecture t) {
        return t.date - this.date;
    }
}

class P4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int max = 0;
        ArrayList<Lecture> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int m = kb.nextInt();
            int d = kb.nextInt();
            arr.add(new Lecture(m, d));
            if(d > max) max = d;
        }
        Collections.sort(arr);
//6
//50 2
//20 1
//40 2
//60 3
//30 3
//30 1
        solution(n, max, arr); //150
    }

    public static void solution(int n, int max, List<Lecture> arr) {
        int answer = 0;
//*        PriorityQueue<Integer> pQ = new PriorityQueue<>(); //기본형태. poll하면 가장 작은 값 나옴.
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());// poll하면 가장 큰 값 나옴.
        int j = 0;
        for(int i = max; i >= 1; i--) {
            for ( ; j < n; j++) {
                if(arr.get(j).date < i) break;
                pQ.offer(arr.get(j).money);
            }
            if (!pQ.isEmpty()) answer += pQ.poll();
        }

        System.out.println(answer);
    }

}
