package chapter2;

import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                //System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();

        byte a = 1;
        while(a<=10)
            System.out.println("a = "+a++);
        do
            System.out.println("do while : a = "+a--);
        while (a<10);
        System.out.println("end of program");
        
        int b = 0;
        boolean bol = true;
        for( ;b<10;b++)
            System.out.println("b = "+b++);

        System.out.println("enter a valid number");
        Scanner q = new Scanner(System.in);
        int limit = q.nextInt();
        for(int x=1;x<limit;x++){
            for(int y=1;y<=x;y++){
                System.out.print(x);
            }
            System.out.println();
        }
        String[] colors ={"black","red","pink","yellow","white","blue"}; 
        for(String color: colors)
            System.out.println("Color: "+color);
        ROW_TABLE: for(int p = 1;p<=10;p++){
        COL_TABLE:      for(int l = 1;l<=10;l++){
                            if(l==5)
                                // break ROW_TABLE;
                                continue ROW_TABLE;
                            System.out.print(l*p+"\t");
                            }
                        System.out.println();     
        }
    }
}

