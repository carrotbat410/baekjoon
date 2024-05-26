package hashMapHashSetTreeSet;

import java.util.HashMap;
import java.util.Scanner;

//문제명: 모든 아나그램 찾기

class P4 {
    public static void main(String[] args) {
        //스캐너로 받을시
        Scanner kb = new Scanner(System.in);

        String S = kb.nextLine();
        String T = kb.nextLine();
//bacaAacba
//abc
        solution(S, T); //3
    }

    public static void solution(String s, String t) {
        int answer = 0;

        HashMap<Character, Integer> tMap = new HashMap<>();
        for(char x : t.toCharArray()) tMap.put(x, tMap.getOrDefault(x, 0) + 1);

        HashMap<Character, Integer> tmpMap = new HashMap<>();
        for (int i = 0; i < t.length() - 1; i++) tmpMap.put(s.charAt(i), tmpMap.getOrDefault(s.charAt(i), 0) + 1);
        int lt = 0;
        for(int i = t.length() - 1; i < s.length(); i++) {
            //하나 추가
            char key = s.charAt(i);
            tmpMap.put(key, tmpMap.getOrDefault(key, 0) + 1);

            //비교하고 true면 answer++
            if(tmpMap.equals(tMap)) answer++; //! equals 메서드 제공함. 구현할 필요 없음!! 댕꿀이네

            //하나 제거(1개남았으면 바로 제거)
            char deleteKey = s.charAt(lt++);
            if(tmpMap.get(deleteKey) == 1) tmpMap.remove(deleteKey);
            else tmpMap.put(deleteKey, tmpMap.get(deleteKey) - 1);
        }
        System.out.println(answer);
    }

}
