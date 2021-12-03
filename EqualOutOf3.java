public class EqualOutOf3 {
    public static void main(String[] args) {
        int Test1 = equal3(2, 2, 2);
        int Test2 = equal3(1, 2, 1);
        int Test3 = equal3(1, 2, 2);

        System.out.println(Test1 + " " + Test2 + " " + Test3);
        
    }

    public static int equal3(int a, int b, int c) {
		int count = 0;
		if (a == b) count++;
		if (a == c) count++;
		if (b == c) count++;
		return count == 1 ? 2 : count;
	}
}