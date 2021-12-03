//https://edabit.com/challenge/L5uwyF4SsAG4DmPpJ

public class fullSpins {
    public static void main(String[] args) {
        String[] turns = {"left", "left", "left", "left"};
		System.out.println(spinAround(turns));
    }

    public static int spinAround(String[] turns) {
		return (int)Math.floor(Math.abs(java.util.Arrays.stream(turns).mapToDouble(e -> "right".equals(e) ? 0.25 : -0.25).sum()));
	}

	/** Elegant solution:
	 * Cast to int and Math.floor or Math.round not needed when summing up as int and dividing by 4
	 * 
	public static int spinAround(String[] turns) {
		return (Math.abs(java.util.Arrays.stream(turns).mapToInt(e -> e.equals("right") ? 1 : -1).sum()/4));
	} */
}