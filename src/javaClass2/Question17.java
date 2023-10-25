package javaClass2;

public class Question17 {
    private String city = "Lathrop";
    private static String country= "United States";

    public void demo(){
        Question17 Obj = new Question17();
        System.out.println(Obj.country);
    }
    public static void demo1(){
         Question17 Obj = new Question17();
        System.out.println(Obj.city);

    }
    public static void main(String[] args){
        Question17 obj = new Question17();
        obj.demo();
        demo1();



    }


}
