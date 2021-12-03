public class ReverseString {
    public static void main(String[] args) {
        String str = "Test 123";
        System.out.println(reverse(str));
        
    }

    public static String reverse(final String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
