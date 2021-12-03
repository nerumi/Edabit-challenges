public class EvenOddWar {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
        System.out.println(warOfNumbers(numbers));
    }

    public static int warOfNumbers(int[] numbers){
        int even = 0;
        int odd = 0;
        for (int i : numbers) {
            if (i % 2 == 0) {
                even = even + i;    // even += i;
            } else {
                odd = odd + i;      // odd += i;
            }
        }
        return even > odd ? even - odd : odd - even;    // return Math.abs(even - odd);
    }

    /* Elegante Lösung
     * reduce nimmt eine Identität und eine zugehörige assoziative Funktion ( (a*b)*c = a*(b*c) ) und reduziert den Stream auf ein Ergebnis.
     * z.B. min, max, Summe können so gebildet werden.
     * 
     * In der Lösung unten werden die zwei Parameter addiert oder subtrahiert, abhängig davon, ob b ungerade ist oder nicht.
     * Die Abfrage auf ungerade könnte auch (b % 2) == 1 lauten, aber bitweises verunden mit 1 funtioniert genause, weil alle ungeraden
     * Zahlen in ihrer bitweisen Darstellung eine 1 an letzter Stelle haben.
     * Schlussendlich werden alle geraden Zahlen subtrahiert und alle ungeraden Zahlen addiert und schließlich der Absolutwert returned.
     * 
    public static int warOfNumbers(int[] numbers){
        return Math.abs(java.util.Arrays.stream(numbers).reduce(0, (a, b) -> (b & 1) == 1 ? a + b : a - b));
    } */
}
