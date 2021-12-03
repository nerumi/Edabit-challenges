import java.util.Arrays;

public class ExistsANumberHigher {
    public static void main(String[] args) {
        int[] arr = {1, 4};
        boolean result = existsHigher(arr, 4);
        System.out.println(result);
        
    }
	public static boolean existsHigher(int[] arr, int n) {
        if (arr.length == 0) return false;
        Arrays.sort(arr);
        return arr[arr.length - 1] >= n;
	}
}