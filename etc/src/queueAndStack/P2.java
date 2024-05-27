package queueAndStack;

//문제명: 괄호문자제거

import java.util.Scanner;
import java.util.Stack;

class P2 {
    public static void main(String[] args) {
        //스캐너로 받을시
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();
//(A(BC)D)EF(G(H)(IJ)K)LM(N)
        solution(str); //EFLM
    }

    public static void solution(String str) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()) {
            if(x == '(') stack.push(x);
            else if (x == ')') stack.pop();
            else {
                if(stack.isEmpty()) answer.append(x);
            }
        }
        System.out.println(answer);
    }

}
