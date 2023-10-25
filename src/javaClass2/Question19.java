package javaClass2;

public class Question19 {

    private String a = "pareksha";
    private static String b = "rajvir";

    public void postman() {
        Question19 obj = new Question19();
        System.out.println(obj.b);
        System.out.println(a);
    }

    public static void agile() {
        Question19 obj = new Question19();
        System.out.println(obj.a);
        System.out.println(b);

    }

    public static void main(String[] args){
        Question19 obj = new Question19();
        obj.postman();
        agile();



    }
}