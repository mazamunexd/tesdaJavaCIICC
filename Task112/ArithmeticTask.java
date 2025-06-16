package Task112;

public class ArithmeticTask {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Add
        int sum = a + b;

        System.out.println("Sum: " + sum);

         // Subtract
        int difference = a - b;

        System.out.println("Difference: " + difference);

        // Multiply
        int product = a * b;

        System.out.println("Product: " + product);

        // Divide
        if (b != 0) {
            int quotient = a / b;

            System.out.println("Quotient: " + quotient);

        } else {
            System.out.println("Division by zero is not allowed.");

        }

    }

}