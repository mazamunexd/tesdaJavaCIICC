package others;
import java.util.*;

public class test{
  public static void main(String[] args) {
    ArrayList list1 = new ArrayList();
    list1.add(1);
    list1.add('c');
    list1.add(true);
    list1.add("jav");
    System.out.println(list1);

    ArrayList list2 = new ArrayList(10);
    ArrayList list3 = new ArrayList(list2);

    ArrayList<String> list4 = new ArrayList<String>();
    ArrayList<String> list5 = new ArrayList<>();

    ArrayList<Integer> list6 = new ArrayList<>();
    list6.add(21);
    list6.add(11);
    list6.add(3);
    list6.add(19);
    list6.add(9);
    list6.add(0, 100);
    System.out.println(list6.add(9));
    System.out.println(list6);



  }
}