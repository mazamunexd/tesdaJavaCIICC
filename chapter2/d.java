package chapter2;
public class d {
    public static void main(String[] args) {
        int tableSize = 10;
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}