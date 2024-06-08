package advancedDFSAndBFS;

import java.util.ArrayList;
import java.util.Scanner;

//문제명: 피자 배달 거리(삼성 SW역량평가 기출문제 : DFS활용)
public class P15 {
    static int n, m, pzCnt = 0;
    static int answer = Integer.MAX_VALUE;
    static ArrayList<Point15> hs, pz;
    static int[] selectedPzIdx;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        hs = new ArrayList<>();
        pz = new ArrayList<>();
        for(int y = 0; y < n; y++) {
            for(int x = 0; x < n; x++) {
                int tmp = kb.nextInt();
                if(tmp == 1) hs.add(new Point15(x, y));
                else if(tmp == 2) pz.add(new Point15(x, y));
            }
        }
        pzCnt = pz.size();
        selectedPzIdx = new int[m];
        DFS(0, 0);
        System.out.println(answer);
    }

    public static void DFS(int L, int s) {
        if(L == m) { // 조합 완성. e.g. 0,1,2,4번 피자집 선택
            int sum = 0;
            for (Point15 h : hs) {
                int dis = Integer.MAX_VALUE;
                for(int i : selectedPzIdx) {
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        }else {
            for(int i = s; i < pzCnt; i++) { // 6C4 => pzCnt C m
                selectedPzIdx[L] = i;
                DFS(L + 1, i + 1); //! 올바르게 다음 인덱스를 탐색하기
            }
        }
    }

}

class Point15 {
    int x, y;
    Point15(int x, int y) {
        this.x = x;
        this.y = y;
    }
}