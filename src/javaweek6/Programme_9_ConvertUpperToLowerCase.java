package javaweek6;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme_9_ConvertUpperToLowerCase {
    //Conversion of Uppercase to Lower case method
    public void convertUppercaseToLowerCase(String text){
        System.out.println("The enter Lowercase String is = " +text.toLowerCase());

    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A uppercase string: ");
        String text1 = scanner.nextLine();

        Programme_9_ConvertUpperToLowerCase obj = new Programme_9_ConvertUpperToLowerCase();
        obj.convertUppercaseToLowerCase(text1);
        // closing the scanner object
        scanner.close();

    }
}
