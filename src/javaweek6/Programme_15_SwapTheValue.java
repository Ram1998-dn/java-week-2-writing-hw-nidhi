package javaweek6;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class Programme_15_SwapTheValue {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first variable value :");
        int first = scanner.nextInt();

        System.out.println("Enter second variable value :");
        int second = scanner.nextInt();
        Programme_15_SwapTheValue obj = new Programme_15_SwapTheValue();
        obj.swapTheValue(first,second);
        scanner.close();
    }
    //Swapping the value of variables
    public void swapTheValue(int a,int b){
        int c;
        System.out.println("Before the swapping, The values of first variable is : " + a + " and second variable is : " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping, The values of first variable is : " + a + " and second variable is : " + b);
    }

}
