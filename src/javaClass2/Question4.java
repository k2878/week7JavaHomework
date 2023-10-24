package javaClass2;

public class Question4 {
    private String name = "tabu";
    private String name1 = "salman";
    static String name2 = "ajay";
    static String name3 = "manny";
    public static void main(String[] args){
        income1();
        Question4 obj = new Question4();
        obj.income2();

    }
    public static void income1(){
        System.out.println(Question4.name2);
        System.out.println(Question4.name3);
    }
    public void income2(){
        System.out.println(name);
        System.out.println(name1);
    }
}
