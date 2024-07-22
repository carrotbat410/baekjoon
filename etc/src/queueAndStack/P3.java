package queueAndStack;

import java.util.Scanner;
import java.util.Stack;

//문제명: 크레인 인형뽑기(카카오)
//* stack.peek()는 값만 가져오고, stack.pop()은 스택에서 제거후 값을 가져온다.
class P3 {
    public static void main(String[] args) {
        //스캐너로 받을시
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] board = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        int m = kb.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) moves[i] = kb.nextInt();
        kb.nextLine();
//5
//0 0 0 0 0
//0 0 1 0 3
//0 2 5 0 1
//4 2 4 4 2
//3 5 1 3 1
//8
//1 5 3 5 1 2 1 4
        solution(n, board, m, moves); //4
    }

    public static void solution(int n, int[][] board, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int xIdx : moves) {
            for(int y = 0; y < n; y++) {
                int target = board[y][xIdx - 1];
                if(target != 0) {
                    if(stack.isEmpty()) stack.push(target);
                    else {
                        if(stack.peek() == target) {
                            stack.pop();
                            answer += 2;
                        }else {
                            stack.push(target);
                        }
                    }
                    board[y][xIdx - 1] = 0;
                    break;
                }
            }
        }

        System.out.println(answer);
    }

}
