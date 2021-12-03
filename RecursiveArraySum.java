public class RecursiveArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(sum(arr));
    }

    public static int sum(int[] arr) {
        if (arr == null || arr.length == 0) {return 0;}
		if (arr.length == 1) {return arr[0];}
        return arr[0] + sum(java.util.Arrays.copyOfRange(arr, 1, arr.length));
	}
}
