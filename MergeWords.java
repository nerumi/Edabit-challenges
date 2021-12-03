public class MergeWords {
    public static void main(String[] args) {
        String left = "test";
        String right = "case";
        System.out.println(getWord(left, right));
        
    }

    public static String getWord(String left, String right) {
        return left.substring(0, 1).toUpperCase().concat(left.substring(1)).concat(right);
	}
}
