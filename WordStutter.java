public class WordStutter {
    public static void main(String[] args) {
        String word = "Test";
        System.out.println(stutter(word));
        
    }

    public static String stutter(String word) {
        String stutter = word.substring(0, 2).concat("... ");
		return stutter.concat(stutter).concat(word).concat("?");
	}
}
