public class SortNumArray {
    public static void main(String[] args) {
        int[] nums = {};
        for (int elem : sortNumsAscending(nums)) {
            System.out.print(elem + " ");
        }
    }

    public static int[] sortNumsAscending(int[] nums) {
        java.util.Arrays.sort(nums);
        return nums;
    }
}
