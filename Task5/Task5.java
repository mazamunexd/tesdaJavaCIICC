package Task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println();
            System.out.println("=========================");
            System.out.println("| All numbers are equal |");
            System.out.println("=========================");
            System.out.println();
        } else {
            int largest = num1;
            if (num2 > largest) {
                largest = num2;
            }
            if (num3 > largest) {
                largest = num3;
            }
            System.out.println();
            System.out.println("================================");
            System.out.printf("| Largest number: %-12s |\n", largest);
            System.out.println("================================");
            System.out.println();
        }

        scanner.close();
    }
}