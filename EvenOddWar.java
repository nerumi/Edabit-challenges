public class EvenOddWar {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
        System.out.println(warOfNumbers(numbers));
    }

    public static int warOfNumbers(int[] numbers){
        int even = 0;
        int odd = 0;
        for (int i : numbers) {
            if (i % 2 == 0) {
                even = even + i;    // even += i;
            } else {
                odd = odd + i;      // odd += i;
            }
        }
        return even > odd ? even - odd : odd - even;    // return Math.abs(even - odd);
    }

    /** Elegant solution:
     * reduce takes an identity and a related associative function ( (a*b)*c = a*(b*c) ) and reduces the stream to a single result.
     * i.e. min, max, sum can be calculated this way
     * 
     * In the solution below the two parameters are either added or substracted from one another, depending on wether they're even or odd.
     * The boolean logic for odd could just as well be (b % 2) == 1, but using bitwise AND with 1 is correct as well because all uneven numbers in binary form have a 1 at the end.
     * The solution works by substracting all even numbers and adding all uneven numbers and returning the absolut value as a result.
     * 
    public static int warOfNumbers(int[] numbers){
        return Math.abs(java.util.Arrays.stream(numbers).reduce(0, (a, b) -> (b & 1) == 1 ? a + b : a - b));
    } */
}
