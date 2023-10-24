package javaClass2;

public class InstanceVariables {
    private String name = "something";
    private String name2 = "Good";
    private static int numb=1;
    private static String value="good morning";
    //main
    public static void main(String[] args){
        InstanceVariables obj = new InstanceVariables();
        obj.InstanceMethod();
        secondQuestion();

    }

    public void InstanceMethod(){
        System.out.println(name);
        System.out.println(name2);

    }
    public static void secondQuestion(){
        System.out.println(numb);
        System.out.println(value);
    }

    }
