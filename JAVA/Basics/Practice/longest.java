import java.util.*;

public class longest{
    public static void main(String[]args){
        String s = "abacabad";
    }

    public static String longestsubstring (String s){
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            int len = right - left + 1;
            if (len > maxLen) {
                maxLen = len;
                start = left;
            }
        }
        return s.substring(start, start + maxLen);
    }

    
}