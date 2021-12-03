public class CountTrueInArray {
    public static void main(String[] args) {
        boolean[] boos = {true, false, true};
        System.out.println(countTrue(boos));
        
    }

    public static int countTrue(boolean[] arr) {
		int count = 0;
		for (boolean boo : arr) if (boo) count++;
		return count;
	}
}
