package otherFolder;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class test {
  public static void main(String[] args) {
    // String s1 = "java";
    // StringBuilder s2 = new StringBuilder("java");
    // if (s1==s2) {
    //   System.out.println("1");
    // }
    // if (s1.equals(s2)) {
    //   System.out.println("2");
    // }

    // StringBuilder puzzle = new StringBuilder("Java");
    // puzzle.reverse();
    // puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);;
    // System.out.println(puzzle);
    // System.out.println();

    // LocalDate date = LocalDate.parse("2018-04-30",
    // DateTimeFormatter.ISO_LOCAL_DATE);
    // LocalTime time = LocalTime.parse("3", DateTimeFormatter.ISO_LOCAL_TIME);
    // date.plusDays(2);
    // date.plusHours(3);
    // System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

    LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
    System.out.println(date.getYear() + " " + date.getMonth() + " "
    + date.getDayOfMonth());


  }
}