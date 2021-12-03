import java.lang.Integer;

public class NumericStrings {
    public static void main(String[] args) {
        String a = "100";
        String b = "50";
        System.out.println(add(a, b));
    }

    public static String add(String a, String b) {
        if (a == null || "".equals(a)) return "Invalid Operation";
        if (b == null || "".equals(b)) return "Invalid Operation";
        return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
    }

    /* Elegant solution:
    public static String add(String a, String b) {
        try {
            return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
        } catch (Exception e) {
            return "Invalid Operation";
        }
    } */
}
