public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        System.out.println(missingNum(nums));
    }

    public static int missingNum(int[] nums) {
		int[] container = new int[10];
        for (int i : nums) {
            container[i - 1] = i;
        }
        for (int i = 0; i < container.length; i++) {
            if (container[i] == 0) return i + 1;
        }
        return -1;
	}

    /* Elegant solution:
    public static int missingNum(int[] nums) {
        return 55-java.util.Arrays.stream(nums).sum();
    } */
}
