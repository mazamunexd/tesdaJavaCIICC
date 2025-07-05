package otherFolder;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

public class Fish {
  public static void main(String[] args) {
    int numFish = 4;
    String fishType = "Tuna";
    int anotherFish = numFish + 1;
    System.out.println(anotherFish + " " + fishType);
    System.out.println(numFish + " " + 1);

    String s = "Hello";
    String t = new String(s);
    if ("Hello".equals(s)) System.out.println("one");
    if (t==s) System.out.println("two");
    if (t.equals(s)) System.out.println("three");
    if ("Hello" == s) System.out.println("four");
    if ("Hello" == t) System.out.println("five");
    System.out.println();

    StringBuilder sb = new StringBuilder();
    sb.append("aaa").insert(1,"bb").insert(4,"ccc");
    System.out.println(sb);
    System.out.println();
    
    String s1 = "java";
    StringBuilder s2 = new StringBuilder("java");
    // if (s1 == s2) 
      System.out.println("1");
      System.out.println();
    
    if (s1.equals(s2))
    System.out.println("2");
    System.out.println();

    // String letters = "abcdef";
    // System.out.println(letters.length());
    // System.out.println(letters.charAt(3));
    // System.out.println(letters.charAt(6));
    // System.out.println();

    String numbers = "012345678";
    System.out.println();
    System.out.println(numbers.substring(1,3));
    System.out.println(numbers.substring(7,7));
    System.out.println(numbers.substring(7));
    System.out.println();

    String u = "purr";
    u.toUpperCase();
    u.trim();
    u.substring(1,3);
    u += " two";
    System.out.println(u.length());
    System.out.println();

    String z = "";
    z += 2;
    z +='c';
    z+= false;
    if (z == "2cfalse") System.out.println("==");
    if (z.equals("2cfalse")) System.out.println("equals");
    System.out.println();

    // int total=0;
    // StringBuilder letterz = new StringBuilder("abcdefg");
    // total += letterz.substring(1,2).length();
    // total += letterz.substring(6,6).length();
    // total += letterz.substring(6,5).length();
    // System.out.println(total);
    // System.out.println();

    StringBuilder puzzle = new StringBuilder("Java");
    puzzle.reverse();
    puzzle.append("vaJ$").substring(0,4);
    // puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
    // puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length());
    

    System.out.println(puzzle);
    System.out.println();

    // List<String> list = new ArrayList<String>();
    // list.add("one");
    // list.add("two");
    // list.add(7);
    // for (String m : list)
    // System.out.println(m);

    LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
    Period p = Period.of(1, 2, 3);
    d = d.minus(p);
    DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
    System.out.println(d.format(f));
    System.out.println();

    LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
    date.plusDays(2);
    date.plusYears(3);
    System.out.println(date.getYear() + " " + date.getMonth() + " "
    + date.getDayOfMonth());
    System.out.println();


  
  }
}

class Lion {
  public void roar (String roar1, StringBuilder roar2){
    roar1.concat("!!!");
    roar2.append("!!!");
  }
  public static void main(String[] args) {
    String roar1 = "roar";
    StringBuilder roar2 = new StringBuilder("roar");
    new Lion().roar(roar1, roar2);
    System.out.println(roar1 + " " + roar2);
    System.out.println();

    LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
    System.out.println(date.getYear() + " " + date.getMonth() + " "
    + date.getDayOfMonth());
    System.out.println();

    
  }
}

class Date {
  public static void main(String[] args) {
    // LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
    // date.plusDays(2);
    // date.plusHours(3);
    // System.out.println(date.getYear() + " " + date.getMonth() + " "
    // + date.getDayOfMonth());

    // List<String> one = new ArrayList<String>();
    // one.add("abc");
    // List<String> two = new ArrayList<>();
    // two.add("abc");
    // if (one == two)
    // System.out.println("A");
    // else if (one.equals(two))
    // System.out.println("B");
    // else
    // System.out.println("C");

//     String s1 = "java";
//     StringBuilder s2 = new StringBuilder("java");
    // if (s1 == s2)
    //  System.out.print("1");
    //  if (s1.equals(s2))
    //  System.out.print("2");
    
  }
}
