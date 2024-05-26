package hashMapHashSetTreeSet;

import java.util.HashMap;
import java.util.Scanner;

//문제명: 학급 회장(해쉬)

class P1 {
    public static void main(String[] args) {
        //스캐너로 받을시
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        kb.nextLine(); //! nextInt()는 버퍼에 \n남음.
        String str = kb.nextLine(); //! 그래서 버퍼 리셋시키기
//15
//BACBACCACCBDEDE
        solution(n,str);
    }

    public static void solution(int n, String str) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        //System.out.println(map.containsKey('F'));
        //System.out.println(map.size());
        //System.out.println(map.remove('C')); // 반환값은 해당 키의 값이 나옴

        int max = 0;
        for(char key : map.keySet()){
            //System.out.println(key+" "+map.get(key));
            if(map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }
        System.out.println(answer);
    }


}
