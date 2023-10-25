package javaClass2;

public class Question18 {
    private String housenumber = "145698";
    private static String council = "red county";

    public void borough() {
        Question18 obj = new Question18();
        System.out.println(obj.council);
    }

    public static void address() {
        Question18 obj = new Question18();
        System.out.println(obj.housenumber);

    }

    public static void main(String[] args) {
        Question18 obj = new Question18();
        obj.borough();
        address();
    }
}
