import java.util.ArrayList;

public class String_try {
    public static void main(String[] args) {
        String str = "abceba";
        System.out.println(ispali(str));
    }

    static Boolean ispali(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
              return false;
            }
            start++;
            end--;
        }
        return true;
    }
}