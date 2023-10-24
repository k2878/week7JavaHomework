package javaClass2;

public class Question14 {
    static int a = 125;
    static int b = 24;
    public static void main(String[] args){

        System.out.println("Addion relsult: " + add());
        System.out.println("subtract relsult: " + sub());
        Question5 object = new Question5();
        System.out.println("divide relsult: " + object.divide());
        System.out.println("multiply relsult: " + object.multiply());
        System.out.println("mod relsult: " + calMod());
    }
    public static String add(){
        int result = a+b;
        return a + " + " + b +" = " + result;
    }
    public static String sub(){
        int result = a-b;
        return a + " - " + b +" = " + result;
    }
    public String divide(){
        int result = a/b;
        return a + " / " + b +" = " + result;
    }
    public String multiply(){
        int result = a*b;
        return a + " * " + b +" = " + result;
    }
    public static String calMod(){
        int result = a%b;
        return a + " mod " + b +" = " + result;
    }
}
