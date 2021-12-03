public class CountVowels {
    public static void main(String[] args) {
        String str = "Hallo";
        System.out.println(getCount(str));
        
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(String.valueOf(str.charAt(i)))) vowelsCount++;
        }
        return vowelsCount;
    }

    /* Elegant solution
    public static int getCount(String str) {
        return str.replaceAll("[^aeiouAEIOU]", "").length();
    } */
}
