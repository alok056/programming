package interview;

import java.util.HashMap;
import java.util.Map;

public class MPL {
    public static void main(String[] args) {
        String s = "ADOAXYZBECODEABANC";
        String t = "ABC";

        System.out.println(getSubstring(s, t));
    }

    static String getSubstring(String s, String t) {
        String result = "";

        Map<Character, Integer> map1 = new HashMap<>();
        for (Character c: t.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> map2 = new HashMap<>();

        int i = 0;
        int j = 0;

        int count = 0;
        while (j < s.length()) {
            Character c  = s.charAt(j);
            if (map1.containsKey(c)) {
                int currentCharCount = map2.getOrDefault(c, 0);
                if (currentCharCount < map1.get(c)) {
                    count++;
                }

                currentCharCount++;
                map2.put(c, currentCharCount);
            }

            while (count == t.length() && checkIfMapContains(map1, map2)) {
                if (result.length() == 0 || j - i < result.length()) {
                    result =  s.substring(i, j);
                }

                Character c2 = s.charAt(i);
                if (map2.containsKey(c2)) {
                    map2.put(c2, map2.get(c2) - 1);

                    count--;
                }

                i++;
            }

            j++;
        }


        return result;
    }

    static boolean checkIfMapContains(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        for (Character c: map1.keySet()) {
            if (!map2.containsKey(c) || map2.get(c) < map1.get(c)) {
                return false;
            }
        }

        return true;
    }
}
