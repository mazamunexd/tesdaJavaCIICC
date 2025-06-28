package chapter3;

public class StringLesson {
  public static void main(String[] args) {
    // concatenation
    int three = 3;
    int four = 4;
    int five = 5;
    five += 5;
    System.out.println(1 + 2 + three + four + "D"); //output: 10D //1 + 2 + 3 + 4 = 10, then "D" is concatenated
    System.out.println(1 + 2 + three + four + five + "AAA"); //output: 20AAA //1 + 2 + 3 + 4 + 10 = 20, then "AAA" is concatenated
    System.out.println(1 + 2 + "C" + 1 + 2); //output: 3C12 //1 + 2 = 3, then "C" is concatenated, then 1 + 2 = 12

    // 
    String name1 = "Hampas", name2 = "Lupang", name3 = " anak!";
    String name = name1 + name2 + name3; 
    String name4 = new String("Hampas Lupang anak!");
    System.out.println(name);
    System.out.println(name1.toUpperCase());
    System.out.println(String.valueOf(name).toUpperCase());
    System.out.println(String.valueOf(name1).toLowerCase());
    System.out.println(String.valueOf(name2).toLowerCase());
    System.out.println(String.valueOf(name).toLowerCase());
    System.out.println(String.valueOf(name).toLowerCase().length());
    System.out.println(name4);

    String name5 = "Basurero";
    System.out.println(name5);
    String name6 = new String("Pulube");
    System.out.println(name6);

    String name7 = "Supot";
    System.out.println(name7);
    String name8 = new String("Supot aye!");
    System.out.println(name8);

    System.out.println(name1.equals(name2));
    System.out.println(name1.equals("Hampas"));
    System.out.println(name1.equalsIgnoreCase("Hampas"));

    int numFish = 4;
    String typeFish = "tuna";
    int anotherFish = numFish + 1;
    System.out.println(anotherFish + " " + typeFish); 
    System.out.println(numFish + " " + 1);

  } 
}