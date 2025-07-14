import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        scanner.nextLine();
        String op = scanner.nextLine();

        double result = 0;
        
        if (op.equals("+")) {
            result = n1 + n2;
        } else if (op.equals("-")) {
            result = n1 - n2;
        } else if (op.equals("*")) {
            result = n1 * n2;
        } else if (op.equals("/")) {
            if (n2 != 0) {
                result = (double) n1 / n2;
            } else {
                System.out.println("Error: Cannot divide by zero.");
                return;
            }
        } else {
            System.out.println("Error: Invalid operator.");
            return;
        }
        System.out.println(result);
        scanner.close();
    }
}