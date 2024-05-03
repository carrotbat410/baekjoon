package string;
//! 제출시 package 이름 제거, Main클래스로 바꾸기

//문제명: 회문 문자열

class P7 {
    public static void main(String[] args) {
        //#스캐너로 받을시
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next();

        //#직접 입력
        String str = "gooG";

        String answer = solution1(str);
        System.out.println(answer);
    }


    public static String solution1(String str) {
        char[] charArr = str.toCharArray();
        int lt = 0;
        int rt = charArr.length - 1;

        while(lt < rt) {
            if(Character.toUpperCase(charArr[lt]) != Character.toUpperCase(charArr[rt])) return "NO";
            else {
                lt++;
                rt--;
            }
        }
        return "YES";
    }

    //StringBuilder, equalsIgnoreCase 사용
    public static String solution2(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("reversedStr: " + reversedStr);
        if (str.equalsIgnoreCase(reversedStr)) return "YES"; //대소문자 무시함.
        return "NO";
    }



}