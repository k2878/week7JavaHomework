package javaClass2;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number to multiply by and upto 10: ");
        int a = scanner.nextInt();
        for(int b = 1; b <= 10; b++ ){
            System.out.println(a*b);
        }
        scanner.close();

        }

}
