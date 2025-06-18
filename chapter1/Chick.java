package chapter1;

// public class Chick {
//     public Chick() {
//         System.out.println("Chick class created");
//     }
// }

public class Chick {
    private String name = "Fluffy";
    {
        System.out.println("Chick class created");
    }
    public Chick() {
        name = "Stuffy";
        System.out.println("Chick constructor called");
    }
    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }
}


class Chicken {
    int numEggs = 0;
    String name;

    public Chicken() {
        name = "Chicken";
    }
}

class Swan {
    int numberEggs;
    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 1;
        System.err.println(mother.numberEggs);
    }
}