public class FindTheBomb {
    public static void main(String[] args) {
        String str = "something something boms";
        System.out.println(bomb(str));
        
    }

    public static String bomb(String str) {
        return str.toLowerCase().contains("bomb") ? "DUCK!" : "Relax, there's no bomb.";
	}
}
