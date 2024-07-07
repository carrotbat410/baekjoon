package greedy;

//문제명: 씨름 선수
import java.util.*;

//정렬해놓고 앞에서부터 선택해가는 문제들 => greedy

class Body implements Comparable<Body> {
    public int h, w;
    public Body(int h, int w) {
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Body o) {
        if(o.h == this.h) return o.w - this.w;
        return o.h - this.h;
    }
}
class P1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = kb.nextInt();
            int w = kb.nextInt();
            arr.add(new Body(h, w));
        }
        Collections.sort(arr);
//5
//172 67
//183 65
//180 70
//170 72
//181 60
        solution(arr); //3
    }

    public static void solution(List<Body> arr) {
        int answer = 0;
        int maxW = -1;
        for (Body b : arr) {
            if(b.w > maxW) {
                maxW = b.w;
                answer++;
            }
        }
        System.out.println(answer);
    }

}
