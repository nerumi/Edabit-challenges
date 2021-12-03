public class CountWords {
    public static void main(String[] args) {
        String test = "Ich will wissen, wie viele Wörter in diesem Satz sind";
        System.out.println(countWordsfn(test));
        
    }

    public static int countWordsfn(String s) {
		String[] words = s.split("\\s+");
        return words.length;
	}
}