package javaweek6;

import java.util.Scanner;

/**
 *Write a Java program that takes three numbers as input to calculate and
 *print the average of the numbers.
 */
public class Programme_13_AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number :");
        double a = scanner.nextDouble();
        System.out.println("Enter second number :");
        double b = scanner.nextDouble();
        System.out.println("Enter Third number :");
        double c = scanner.nextDouble();
        averageOfThreeNumbers(a,b,c);



    }
    public static void averageOfThreeNumbers(double a, double b, double c){
        double avg = (a + b +c) / 3;
        System.out.println("The Average of the number :" +avg);
    }

}
