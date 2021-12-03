public class QuadraticSolutions {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;
        System.out.println(solutions(a, b, c));
    }

    public static int solutions(int a, int b, int c) {
		Double disc = Math.pow(b, 2) - 4 * a * c;
        if (disc > 0) return 2;
        if (disc < 0) return 0;
        return 1;
    }
}
