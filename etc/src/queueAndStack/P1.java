package queueAndStack;

//문제명: 올바른 괄호

import java.util.Scanner;
import java.util.Stack;

class P1 {
    public static void main(String[] args) {
        //스캐너로 받을시
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();
//(()(()))(()
        System.out.println(solution(str)); //NO
    }

    public static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()) {
            if(x == '(') stack.push(x);
            else {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";
        return "YES";
    }

}
