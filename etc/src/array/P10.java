package array;
//!제출시 패키지명 제거, 클래스명 Main으로

//문제명: 봉우리 (가장자리는 0으로 초기화)

import java.util.Scanner;

class P10 {
    public static void main(String[] args) {

        //스캐너로 받을시
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
//5
//5 3 7 2 3
//3 7 1 6 1
//7 2 5 3 4
//4 3 6 4 1
//8 7 3 5 2
        solution(n, arr); //10
    }

    public static void solution(int n, int[][] arr) {
        int answer = 0;

        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int target = arr[i][j];

                boolean breakFlag = false;

                for(int k = 0; k < 4; k++) {
                    int nx = j + dx[k];
                    int ny = i + dy[k];

                    if(nx >= 0 && ny >= 0 && nx < n && ny < n && arr[ny][nx] >= target) { //! 같을 경우에는 봉우리 X, arr[ny][nx] >= target이 if문 앞에 있으면 오류남.
                        breakFlag = true;
                        break;
                    }
                }
                if(!breakFlag) answer++;
            }
        }
        System.out.println(answer);
    }

}
