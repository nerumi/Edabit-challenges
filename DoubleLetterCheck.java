public class DoubleLetterCheck {
    public static void main(String[] args) {
        String word = "ooble";
        System.out.println(doubleLetters(word));
        
    }

    public static boolean doubleLetters(String word) {
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i - 1) == word.charAt(i)) return true;
        }
        return false;
	}
}
