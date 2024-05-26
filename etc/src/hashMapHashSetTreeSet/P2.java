package hashMapHashSetTreeSet;

import java.util.HashMap;
import java.util.Scanner;

//문제명: 학급 회장(해쉬)

class P2 {
    public static void main(String[] args) {
        //스캐너로 받을시
        Scanner kb = new Scanner(System.in);

        String str1 = kb.nextLine();
        String str2 = kb.nextLine();
//AbaAeCe
//baeeACA
//YES

//abaCC
//Caaab
//NO
        System.out.println(solution(str1, str2));
    }

    public static String solution(String str1, String str2) {
        //map 만들기
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : str1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        //검증1
        for (char key : str2.toCharArray()) {
            if(!map.containsKey(key)) return "NO";
            if(map.get(key) == 1) map.remove(key);
            else map.put(key, map.get(key) - 1);
        }
        //검증2
        if(!map.isEmpty()) return "NO";
        return "YES";
    }


}
