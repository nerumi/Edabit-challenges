public class InstantJazz {
    public static void main(String[] args) {
        String[] arr = {"G77", "F", "C"};
        for (String chord : jazzify(arr)) {
            System.out.println(chord);
        }
    }

    public static String[] jazzify(String[] arr) {
		String[] chord = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            chord[i] = arr[i].replace("7", "").concat("7");
        }
        return chord;
	}

    /* Elegant solution:
    public static String[]  jazzify(String[] arr) {
		return arr.length == 0 ? new String[]{} : java.util.Arrays.stream(arr).map(s -> s.endsWith("7")==true ? s : s+"7").toArray(String[]::new);
	} */
}
