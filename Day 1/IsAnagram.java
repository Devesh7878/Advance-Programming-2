import java.util.Arrays;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        char[] char1 = s.toCharArray();
        Arrays.sort(char1);
        String sorted1 = new String(char1);
        char[] char2 = t.toCharArray();
        Arrays.sort(char2);
        String sorted2 = new String(char2);
        return sorted1.equals(sorted2);
    }

    public static void main(String[] args) {
        IsAnagram solution = new IsAnagram();
        String s = "listen";
        String t = "silent";
        boolean isAnagram = solution.isAnagram(s, t);
        System.out.println("Is anagram: " + isAnagram);
    }
}
