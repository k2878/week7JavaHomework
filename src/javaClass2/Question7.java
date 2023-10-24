package javaClass2;

import java.util.Scanner;

public class Question7 {
    private static int a = 32;
    private static double f;
    public static void main(String[] args){
        System.out.println("enter temperature value in fahrenheit convert to celsius");
        Scanner sc = new Scanner(System.in);
        f = sc.nextDouble();
        System.out.println("fahrenheit: " + f +" celsius:  "+ (f - a) * 5.0 / 9.0);
        sc.close();
    }

}
