package string;
//! 제출시 package 이름 제거, Main클래스로 바꾸기

//문제명: 중복문자제거

class P6 {

    public static void main(String[] args) {
        //#스캐너로 받을시
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next();

        //#직접 입력
        String str = "ksekkset";

        String answer = solution1(str);
        System.out.println(answer);
    }


    public static String solution1(String str) {
        String answer = "";
        for(int i = 0; i < str.length(); i++) {
            char t = str.charAt(i);
            if (i == str.indexOf(t)) answer += t;
        }
        return answer;
    }
}

/**
 * i == str.indexOf(t) 부분
 *         i    str.indexOf(t)
 *    k    0         0
 *    e    1         1
 *    s    2         2
 *    k    3         0
 *          ...
 */
