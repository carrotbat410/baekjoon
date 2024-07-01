package sortingAndSearching;

//문제명: 좌표 정렬
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {
    public int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) return this.y - o.y;
        return this.x - o.x;
    }
}

class P7 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Point(x, y));
        }
//5
//2 7
//1 3
//1 2
//2 5
//3 6
        Collections.sort(arr);
        for (Point p : arr) System.out.println(p.x + " " + p.y);
//1 2
//1 3
//2 5
//2 7
//3 6
    }

}
