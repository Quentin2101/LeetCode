import java.util.HashMap;
import java.util.Map;

class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> dict = new HashMap<>();
        for(int i = 0; i<s.length(); i++) {
            if (!dict.containsKey(s.charAt(i))) {
                if(!dict.containsValue(t.charAt(i))) {
                    dict.put(s.charAt(i), t.charAt(i));
                }
                else {
                    return false;
                }
            }
            else {
                if (dict.get(s.charAt(i)) != t.charAt(i)) {
                    System.out.println(i);
                    return false;
                }
            }
        }
        return true;
    }
}