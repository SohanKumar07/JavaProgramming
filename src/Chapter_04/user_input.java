package Chapter_04;
import java.util.Scanner;

public class user_input {

    public static void main(String[] args) {
        System.out.println("Taking User input:");

        Scanner objName = new Scanner(System.in);

        int age = objName.nextInt();
        System.out.println("Your name is: " + age);

        int num1 = objName.nextInt();
        System.out.println("Enter the first number: " + num1);

        int num2 = objName.nextInt();
        System.out.println("Enter the second number: " + num2);

        int sum = num1 + num2;
        System.out.println("The sum is:" + sum);
    }
}
