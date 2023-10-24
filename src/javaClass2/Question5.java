package javaClass2;

public class Question5 {
    static int a = 50;
    static int b = 10;
    int c = 40;
    int d = 20;
    public static void main(String[] args){
        System.out.println("Addion relsult: " + add());
        System.out.println("subtract relsult: " + sub());
        Question5 object = new Question5();
        System.out.println("divide relsult: " + object.divide());
        System.out.println("multiply relsult: " + object.multiply());
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
        int result = c/d;
           return c + " / " + d +" = " + result;
       }
    public String multiply(){
        int result = c*d;
        return c + " * " + d +" = " + result;
    }
}
