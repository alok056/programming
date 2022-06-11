package algorithm.string;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String[] input = {"", "a", "aa", "aaaaaaaaa", "aaaaaaaaabbbbbbbbbbbbb", "abbbbbbbbbbbbb", "abcdebcde", "abhcdeaefghijk" , "abcdefghijk"};

        for (String s: input) {
            getLengthOfLongestSubstringWithUniqueCharactersV2(s);
        }
    }

    private static int getLengthOfLongestSubstringWithUniqueCharacters (String s) {
        String longestString = null;
        if (s == null || s.length() == 0) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        int left = 0, right = 1, ans = 1;
        longestString = s.substring(0, 1);
        HashMap<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), 0);

        while (left < s.length() && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                map.put(s.charAt(right), right);
                left++;
                right++;
            } else {
                if (map.containsKey(s.charAt(right))) {
                    map.remove(s.charAt(left));
                    left++;
                } else {
                    map.put(s.charAt(right), right);
                    right++;
                    longestString = ans > right - left ? longestString : s.substring(left, right);
                    ans = Math.max(ans, right - left);
                }
            }
        }

        System.out.println("Input: " + s + ", Longest String: " + longestString + ", length: " + ans);

        return ans;
    }

    private static int getLengthOfLongestSubstringWithUniqueCharactersV2 (String s) {
        String longestString = null;
        if (s == null || s.length() == 0) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        int left = 0, right = 1, ans = 1;
        longestString = s.substring(0, 1);
        HashMap<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), 0);

        while (left < s.length() && right < s.length()) {
            if (map.containsKey(s.charAt(right))) {
                map.remove(s.charAt(left));
                left++;
            } else {
                map.put(s.charAt(right), right);
                right++;
                longestString = ans > right - left ? longestString : s.substring(left, right);
                ans = Math.max(ans, right - left);
            }
        }

        System.out.println("Input: " + s + ", Longest String: " + longestString + ", length: " + ans);

        return ans;
    }
}
