import java.util.Arrays;

public class CalculatorSilent {
    public static void main(String[] args) {
        if(args.length < 3) {
            System.out.println("Invalid inputs: " + Arrays.toString(args));
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        String operator = args[2];
        switch (operator) {
            case "+": System.out.println(a + b); break;
            case "-": System.out.println(a - b); break;
            case "*": System.out.println(a * b); break;
            case "/": System.out.println(a / b); break;
            default: System.out.println("Invalid operator!"); break;
        }
    }
}
