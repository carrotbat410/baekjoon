package greedy;

//문제명: 회의실 배정

import java.util.*;

class Time implements Comparable<Time> {
    public int s, e;
    public Time(int s, int e) {
        this.s = s;
        this.e = e;
    }
    @Override
    public int compareTo(Time o) {
        if(this.e == o.e) return this.s - o.s;
        return this.e - o.e;
    }
}

class P2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = kb.nextInt();
            int e = kb.nextInt();
            arr.add(new Time(s, e));
        }
        Collections.sort(arr);
//5
//1 4
//2 3
//3 5
//4 6
//5 7
        solution(n, arr); //3: (2,3) (3,5) (5,7)
    }

    public static void solution(int n, List<Time> arr) {
        int answer = 1;
        int savedE = arr.get(0).e;

        for(int i = 1; i < n; i++) {
            Time tmpTime = arr.get(i);
            if(tmpTime.s >= savedE) {
                answer++;
                savedE = tmpTime.e;
            }
        }

        System.out.println(answer);
    }

}
