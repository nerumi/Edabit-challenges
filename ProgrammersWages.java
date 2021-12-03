import java.util.*;

public class ProgrammersWages {
    public static void main(String[] args) {
        int one = 100;
        int two = 200;
        int three = 300;
        System.out.println(programmers(one, two, three));
        
    }

    public static int programmers(int one, int two, int three) {
		    int[] wages = {one, two, three};
		    Arrays.sort(wages);
        return wages[2] - wages[0];
    }
}
