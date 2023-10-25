package javaClass2;

public class Question20 {
    private String a = "unitedkingdom";
    private static String b = "spain";

    public void homecountry() {
        Question20 obj = new Question20();
        System.out.println(obj.b);
    }

    public static void holidays() {
        Question20 obj = new Question20();
        System.out.println(obj.a);

    }

    public static void main(String[] args) {
        Question20 obj = new Question20();
        obj.homecountry();
        holidays();
    }
}
