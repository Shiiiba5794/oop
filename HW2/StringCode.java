import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

    /**
     * Given a string, returns the length of the largest run.
     * A a run is a series of adajcent chars that are the same.
     *
     * @param str
     * @return max run length
     */
    public static int maxRun(String str) {
        int max = 1;
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 1;
            }
        }
        return max;
    }


    /**
     * Given a string, for each digit in the original string,
     * replaces the digit with that many occurrences of the character
     * following. So the string "a3tx2z" yields "attttxzzz".
     *
     * @param str
     * @return blown up string
     */
    public static String blowup(String str) {
        String res = "";
        if (str.charAt(str.length() - 1) >= '0' && str.charAt(str.length() - 1) <= '9') {
            if (str != null && str.length() > 0) {
                str = str.substring(0, str.length() - 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if ('0' <= str.charAt(i) && str.charAt(i) <= '9') {
                for (int j = 0; j < str.charAt(i) - '0'; j++) {
                    res += str.charAt(i + 1);
                }
            }
        }
        return res;
    }

    /**
     * Given 2 strings, consider all the substrings within them
     * of length len. Returns true if there are any such substrings
     * which appear in both strings.
     * Compute this in linear time using a HashSet. Len will be 1 or more.
     */
    public static boolean stringIntersect(String a, String b, int len) {
        if (a == null || b == null || len <= 0) {
            return false;
        }

        if (a.length() < len || b.length() < len) {
            return false;
        }

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i <= a.length() - len; i++) {
            set.add(a.substring(i, i + len));
        }

        for (int i = 0; i <= b.length() - len; i++) {
            if (set.contains(b.substring(i, i + len))) {
                return true;
            }
        }

        return false;
    }

//    public static void main(String[] args) {
//        String a = "aaaaabaaaaaaaaac";
//        String b = "1a2b3c";
//        System.out.println(maxRun(a));
//        System.out.println(blowup(b));
//        System.out.println(stringIntersect(a, b, 2));
//    }
}
