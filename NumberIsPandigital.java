public class NumberIsPandigital {
    public static void main(String[] args) {
        long num = 98140723568910L;
        System.out.println(isPandigital(num));
        
    }

    public static boolean isPandigital(long num) {
        boolean[] digits = new boolean[10];
        while (num > 0) {
            digits[(int) (num % 10)] = true;
            num = num / 10;
        }
        for (boolean b : digits) {
            if (!b) return false;
        }
        return true;
    }

    /* Elegant solution:
    public static boolean isPandigital(long num) {
        return String.valueOf(num).chars().distinct().count() == 10;
    } */
}
