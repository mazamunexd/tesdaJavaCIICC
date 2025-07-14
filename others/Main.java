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

class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int height = scanner.nextInt();
        boolean hasAdult = scanner.nextBoolean();

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                if (age < 12) {
                    System.out.println("Sorry, you're too young");
                } else {
                    if (height <= 150) {
                        System.out.println("Sorry, you're not tall enough");
                    } else {
                        if (age < 15) {
                            if (hasAdult) {
                                System.out.println("You can ride with adult supervision!");
                            } else {
                                System.out.println("Sorry, you need an adult with you");
                            }
                        } else {
                            System.out.println("You can ride by yourself!");
                        }
                    }
                }
            }
        }
        scanner.close();
    }
}

class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rnd = scanner.nextLine();
        
        // Write your code below
        System.out.printf("The input is: %s ", rnd);
        scanner.close();
    }
}

class Main4 {
    
}