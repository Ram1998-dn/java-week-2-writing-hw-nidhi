package javaweek6;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Programme_8_AreaOfTriangle {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Length :");
        int length = scanner.nextInt();

        System.out.println("Enter a height :");
        int height = scanner.nextInt();

        Programme_8_AreaOfTriangle obj = new Programme_8_AreaOfTriangle();
        obj.areaOfTriangle(length,height);
        // closing the scanner object
        scanner.close();


    }
    //Calculating the area of triangle with no return type with parameter method
    public void areaOfTriangle(int length , int height){
        int area = (length * height) / 2;
        System.out.println("The Area of triangle is :" +area);
    }
}
