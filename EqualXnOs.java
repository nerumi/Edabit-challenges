public class EqualXnOs {
    public static void main(String[] args) {
        String str = "zzoo";
        System.out.println(getXO(str)); 
    }

    public static boolean getXO (String str) {
		String x = str.toLowerCase().replaceAll("[^x]", "");
        String o = str.toLowerCase().replaceAll("[^o]", "");
        return x.length() == o.length();
    }
}
