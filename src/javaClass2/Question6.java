package javaClass2;

import java.util.Scanner;

public class Question6 {
    //fixed value
    private static  double pi = 3.14;
    private static int  r; //dynamic value
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//scanner formula
        System.out.println("radius value of the circle and find out the area: ");
       r= sc.nextInt();// scanner method returns int
       System.out.println("Here is the Area of circle with radius " + r +" area is:  "+ (pi*r*r));
        sc.close();
    }
}
