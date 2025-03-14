package javaweek6;
/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme_3 {
    //3.1 Declare one instance and one static variable.
    String name = "Nidhi";
    static String name1 = "Class";

    //3.2 Declare one instance method.
    //3.4 Call both instance and static variables into both instance and static methods inside the print statement.
    public void instanceMethod(){
        System.out.println(name);
        System.out.println(Programme_3.name1);
    }

    //3.3 Declare one static method.
    //3.4 Call both instance and static variables into both instance and static methods inside the print statement.
    public static void staticMethod(){
        Programme_3 obj = new Programme_3();
        System.out.println(obj.name);
        System.out.println(name1);
    }

    //3.5 Declare the Main method.
    //3.6 Call both instance and static methods into the Main method and run the programme.
    public static void main(String[] args) {
        Programme_3 obj = new Programme_3();
        obj.instanceMethod();
        staticMethod();
    }
}
