public class ManyOperators {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        String op = "+";
        System.out.println(operate(a, b, op));
        
    }

    public static int operate(int a, int b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "%": return b == 0 ? 0 : a % b;
            case "/": return b == 0 ? 0 : a / b;
            default: return 0;
        }
    }
}
