package javaClass2;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number to get the average of three");
        a = scanner.nextDouble();
        System.out.println("enter second number ");
        b = scanner.nextDouble();
        System.out.println("enter third number ");
        c = scanner.nextDouble();
        System.out.println("get the average of three: " +(a+b+c)/3);
    }

}
