import java.util.HashMap;
import java.util.HashSet;

public class Solution409 {
    public int longestPalindrome(String s) {
        char[] s_array = s.toCharArray();
        HashMap<Character, Integer> s_map = new HashMap<>();
        int max_length = 0;

        //Creating an HashMap containing the number of time a character is encountered in s
        for (int i = 0; i < s_array.length ; i++) {
            if (!s_map.containsKey(s_array[i])) {
                s_map.put(s_array[i], 1);
            }
            else {
                s_map.replace(s_array[i], s_map.get(s_array[i]) + 1);
            }
        }

        // The max length of a palindrome is the number of pair values contained in the HashMap + the maximum number of an odd character in the HashMap
        int sum_odd = 0;
        int count_odd = 0;
        for (int i = 0; i < s_map.size() ; i++) {
            int s_map_value = (int) s_map.values().toArray()[i];
            if (s_map_value % 2 == 0) {
                max_length+= s_map_value;
            } else {
                sum_odd += s_map_value;
                count_odd++;
            }
        }
        if (count_odd > 0) {
            max_length += sum_odd - count_odd + 1;
        }
        return max_length;
    }

    public int longestPalindrome_using_hashset(String s) {
        HashSet<Character> set = new HashSet<>();
        char[] s_array = s.toCharArray();
        int even_count = 0;

        for (int i = 0; i < s_array.length ; i++) {
            if (!set.contains(s_array[i])) {
                set.add(s_array[i]);
            } else {
                set.remove(s_array[i]);
                even_count++;
            }
        }
        if (!set.isEmpty()) {
            return even_count * 2 + 1;
        } else {
            return even_count * 2;
        }
    }
}
