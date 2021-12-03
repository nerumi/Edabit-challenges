public class StringEndingMatch {
    public static void main(String[] args) {
        String s1 = "test";
        String s2 = "t";
        System.out.println(checkEnding(s1, s2));
        
    }

    public static boolean checkEnding(String str1, String str2) {
        return str1.substring(str1.length() - str2.length()).equals(str2);
    }

    /* Elegant solution:
    public static boolean checkEnding(String str1, String str2) {
        return str1.endsWith(str2);
    } */
}
