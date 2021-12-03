public class ReverseNumber {
    public static void main(String[] args) {
        int n = -5121;
        System.out.println(rev(n));
    }

    public static String rev(int n) {
        return new StringBuilder(String.valueOf(Math.abs(n))).reverse().toString();
	}
}
