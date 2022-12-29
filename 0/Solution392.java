public class Solution392 {
    public boolean isSubsequence(String s, String t) {
        char[] t_array = t.toCharArray();
        char[] s_array = s.toCharArray();
        StringBuilder result = new StringBuilder();
        int s_index = 0;

        if (s_array.length == 0) {
            return true;
        }
        for (int i = 0; i<t_array.length; i++) {
            if (t_array[i] == s_array[s_index]) {
                result.append(s_array[s_index]);
                s_index++;
            }
            if (s_index == s_array.length) {
                break;
            }
        }

        return s.equals(result.toString());
    }
}
