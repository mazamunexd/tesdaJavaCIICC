public class aTotalOfTotals {    public static void main(String[] args) {
        int totalSum = 0;
        
        System.out.println("Numbers 1 to 3:");
        for (int i = 1; i <= 3; i++) {
            System.out.print(i + " ");
            totalSum += i;
        }
        System.out.println("\nTotal sum of numbers 1 to 3: " + totalSum);
        
        System.out.println("\nNumbers 1 to 6:");
        int secondSum = 0;
        for (int j = 1; j <= 6; j++) {
            System.out.print(j + " ");
            secondSum += j;
        }
        System.out.println("\nTotal sum of numbers 1 to 6: " + secondSum);
        totalSum += secondSum;
        
        System.out.println("\nNumbers 1 to 4:");
        int thirdSum = 0;
        for (int k = 1; k <= 4; k++) {
            System.out.print(k + " ");
            thirdSum += k;
        }
        System.out.println("\nTotal sum of number 1 to 4: " + thirdSum);
        totalSum += thirdSum;
        
        System.out.println("\nTotal of all sums: " + totalSum);
        
<<<<<<< HEAD
=======
    private static int sumNumbers(int n) {
        return n * (n + 1) / 2;
>>>>>>> refs/remotes/origin/main
    }
}

