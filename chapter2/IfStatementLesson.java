package chapter2;

public class IfStatementLesson {
    public static void main(String[] args) {

        // Ternary operator
        int hourOfDay = 23;
        String greeting = (hourOfDay < 11) ? "Good Morning bb" : "Kumain ka na ba?";
        System.out.println(greeting);    

        // if statement
        if (hourOfDay < 11) {
            System.out.println("Good Morning bb");
        } 

        // if-else statement
        if (hourOfDay < 11) {
            System.out.println("Good Morning bb");
        } else if (hourOfDay < 17) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }

        // else if statement
        if (hourOfDay <= 18) {
            System.out.println("Good Evening"); 
        } else if (hourOfDay <= 12) {
            System.out.println("Good Afternoon"); 
        } else {
            System.out.println("Good Morning bb"); 
        }
    }
}
