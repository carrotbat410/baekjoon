package greedy;

//문제명: 결혼식

import java.util.*;

class Time3 implements Comparable<Time3> {
    public int t;
    public char type;
    public Time3(int t, char type) {
        this.t = t;
        this.type = type;
    }
    @Override
    public int compareTo(Time3 t) {
        if(this.t == t.t) return t.type - this.type; //o먼저, i 나중으로
        else return this.t - t.t;
    }
}

class P3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Time3> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sT = kb.nextInt();
            int oT = kb.nextInt();
            arr.add(new Time3(sT, 'i'));
            arr.add(new Time3(oT, 'o'));
        }
        Collections.sort(arr);
//5
//14 18
//12 15
//15 20
//20 30
//5 14
        solution(arr); //2
    }

    public static void solution(List<Time3> timeLine) {
        int answer = 0;
        int tmp = 0;

        for (Time3 time : timeLine) {
            if(time.type == 'i') {
                tmp++;
                answer = Math.max(answer, tmp);
            }else {
                tmp--;
            }
        }

        System.out.println(answer);
    }

}
