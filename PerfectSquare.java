import java.util.stream.Stream;

public class PerfectSquare {
    public static void main(String[] args) {
        int n = 5;
        int[][] squareArray = squarePatch(n);
        for (int[] row : squareArray) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static int[][] squarePatch(int n) {
		int[][] squareArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                squareArray[i][j] = n;
            }
        }
        return squareArray;
	}

    // Stream Lösung
    /* public static int[][] squarePatch(int n) {
        return Stream.generate(() -> n)
                    .limit(n)
                    .map(size -> Stream.generate(() -> size).limit(size).mapToInt(Integer::intValue).toArray())
                    .toArray(int[][]::new)
            ;
    } */
}
