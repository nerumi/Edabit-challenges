public class TriangleSides {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(otherSides(n)[1]);
    }

    public static double[] otherSides(int n) {
		double[] result = new double[2];
        result[0] = Math.round((double)2 * n * 100.0) / 100.0;
        result[1] = Math.round(n * Math.sqrt(3) * 100.0) / 100.0;
        return result;
    }
    
    /* Elegante Lösung:
    public static double[] otherSides(int n) {
        return new double[]{n*2.0, n*1.7};
    } */
}
